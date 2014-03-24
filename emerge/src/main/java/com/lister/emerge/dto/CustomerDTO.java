package com.lister.emerge.dto;


import java.io.Serializable;
import java.util.Date;

import com.lister.emerge.dto.helper.Json;

/**
 * Customer related details.
 *
 */
public class CustomerDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2200460991285446043L;

	private Long memberId;

    private Long emId;

    private String firstName;

    private String lastName;

    private String dob;

    private String sex;

    private String city;

    private String state;

    private String pinCode;

    private String country;

    private String occupation;

    private String maritalStatus;

    private String email1;

    private String emailPermStatus;

    private String emailPermReason;

    private String emailPermDate;

    private String emailDelStatus;

    private String emailDelReason;

    private String emailDelDate;

    private String email2;

    private String mobileNumber;

    private String mobileOptinStatus;

    private String mobileDelStatus;

    private String mobileNumber2;

    private String memberType;

    private String activeStatus;

    private Date enrollmentDate;

    private String enrollmentOuCode;

    private Long minOrderValue;

    private Long maxOrderValue;

    private Long maxDiscountValue;

    private Long lastPurchaseValue;

    private Date lastPurchaseDate;

    private String distinctPurchaseDates;

    private Long totalPurchaseAmount;

	private Long totalOrdersValue;

    private String c2;

	private String c3;

    private String c4;

	private String c5;

    private String createdDate;

    private String modifiedDate;

    private String createdBy;

    private String modifiedBy;

    //private String
    @Json
    public Long getMemberId() {
        return memberId;
    }

    public Long getEmId() {
        return emId;
    }

    public void setEmId(Long emId) {
        this.emId = emId;
    }
    @Json
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Json
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    @Json
    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmailPermStatus() {
        return emailPermStatus;
    }

    public void setEmailPermStatus(String emailPermStatus) {
        this.emailPermStatus = emailPermStatus;
    }

    public String getEmailPermReason() {
        return emailPermReason;
    }

    public void setEmailPermReason(String emailPermReason) {
        this.emailPermReason = emailPermReason;
    }

    public String getEmailPermDate() {
        return emailPermDate;
    }

    public void setEmailPermDate(String emailPermDate) {
        this.emailPermDate = emailPermDate;
    }

    public String getEmailDelStatus() {
        return emailDelStatus;
    }

    public void setEmailDelStatus(String emailDelStatus) {
        this.emailDelStatus = emailDelStatus;
    }

    public String getEmailDelReason() {
        return emailDelReason;
    }

    public void setEmailDelReason(String emailDelReason) {
        this.emailDelReason = emailDelReason;
    }

    public String getEmailDelDate() {
        return emailDelDate;
    }

    public void setEmailDelDate(String emailDelDate) {
        this.emailDelDate = emailDelDate;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileOptinStatus() {
        return mobileOptinStatus;
    }

    public void setMobileOptinStatus(String mobileOptinStatus) {
        this.mobileOptinStatus = mobileOptinStatus;
    }

    public String getMobileDelStatus() {
        return mobileDelStatus;
    }

    public void setMobileDelStatus(String mobileDelStatus) {
        this.mobileDelStatus = mobileDelStatus;
    }

    public String getMobileNumber2() {
        return mobileNumber2;
    }

    public void setMobileNumber2(String mobileNumber2) {
        this.mobileNumber2 = mobileNumber2;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getEnrollmentOuCode() {
        return enrollmentOuCode;
    }

    public void setEnrollmentOuCode(String enrollmentOuCode) {
        this.enrollmentOuCode = enrollmentOuCode;
    }

    public Long getMinOrderValue() {
        return minOrderValue;
    }

    public void setMinOrderValue(Long minOrderValue) {
        this.minOrderValue = minOrderValue;
    }

    public Long getMaxOrderValue() {
        return maxOrderValue;
    }

    public void setMaxOrderValue(Long maxOrderValue) {
        this.maxOrderValue = maxOrderValue;
    }

    public Long getMaxDiscountValue() {
        return maxDiscountValue;
    }

    public void setMaxDiscountValue(Long maxDiscountValue) {
        this.maxDiscountValue = maxDiscountValue;
    }

    public Long getLastPurchaseValue() {
        return lastPurchaseValue;
    }

    public void setLastPurchaseValue(Long lastPurchaseValue) {
        this.lastPurchaseValue = lastPurchaseValue;
    }

    public Date getLastPurchaseDate() {
        return lastPurchaseDate;
    }

    public void setLastPurchaseDate(Date lastPurchaseDate) {
        this.lastPurchaseDate = lastPurchaseDate;
    }

    public String getDistinctPurchaseDates() {
        return distinctPurchaseDates;
    }

    public void setDistinctPurchaseDates(String distinctPurchaseDates) {
        this.distinctPurchaseDates = distinctPurchaseDates;
    }

    public Long getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    public void setTotalPurchaseAmount(Long totalPurchaseAmount) {
        this.totalPurchaseAmount = totalPurchaseAmount;
    }

    public Long getTotalOrdersValue() {
        return totalOrdersValue;
    }

    public void setTotalOrdersValue(Long totalOrdersValue) {
        this.totalOrdersValue = totalOrdersValue;
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }

    public String getC4() {
        return c4;
    }

    public void setC4(String c4) {
        this.c4 = c4;
    }

    public String getC5() {
        return c5;
    }

    public void setC5(String c5) {
        this.c5 = c5;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
