package com.lister.emerge.dto.json;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

import com.lister.emerge.dto.helper.Json;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static com.lister.emerge.util.AppConstants.PKG_ROOT;

/**
 * This Builder is used to create Json for any object (including collection and map), based on the getter methods of that object. <br/>
 */

@Component(value = "jsonBuilder")
public class JsonBuilder implements BeanFactoryAware {

    private BeanFactory beanFactory;
    private static Map emptyMap;


    static {
        emptyMap = new HashMap(1);
        emptyMap.put("isEmpty", "true");
    }

    public JsonBuilder() {
    }

    /**
     * @param object : A list of objects or an object to be converted to Json
     * @return Json object in String format
     */
    public String toJson(Object object) {
        String returnValue=null;
        if (object instanceof Collection || object instanceof Map) {
            JSONArray jsonArray = null;
            if(beanFactory!=null){
                jsonArray = (JSONArray) beanFactory.getBean("jsonArray");

            }
            if(jsonArray == null){
                jsonArray = new JSONArray();
            }
            if (object instanceof Map) {
                jsonArray.put(object); // Copy all map pairs to Json
            } else {
                Collection collection = (Collection) object;
                if (collection.isEmpty()) {
                    returnValue = jsonArray.put(emptyMap).toString();
                } else {
                    for (Object collectionObject : collection) {
                        jsonArray.put(toJsonForObject(collectionObject));  // Convert each object in the list to Json
                    }
                }
            }
            returnValue = jsonArray.toString();
            return returnValue;
        } else { // Convert a simple object to Json.
            return toJsonForObject(object).toString();
        }
    }


    /**
     * @param object : Any Class's instance that needs to converted to Json object
     * @return Json object
     */
    private JSONObject toJsonForObject(Object object) {
        JSONObject jsonObject = null;
        if(beanFactory !=null){
            jsonObject = (JSONObject) beanFactory.getBean("jsonObject");

        }
        if(jsonObject == null){
            jsonObject = new JSONObject();
        }
        if (object == null) {
            try {
                jsonObject.accumulate("isEmpty", "true");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jsonObject;
        }
        Object value = null;
        String methodName = null;

        Method[] methods = object.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (!method.isAnnotationPresent(Json.class)) {
                continue;
            }
            String jsonKey = method.getAnnotation(Json.class).value();
            if (jsonKey.equals(""))
                jsonKey = method.getName().substring("get".length());
            try {
                value = method.invoke(object);
                if (value instanceof Collection || value instanceof Map) {
                    value = toJson(value);
                } else if (value != null && value.getClass().getName().startsWith(PKG_ROOT)) {
                    value = toJsonForObject(value);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            try {
                jsonObject.accumulate(jsonKey, value);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return jsonObject;
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }


}
