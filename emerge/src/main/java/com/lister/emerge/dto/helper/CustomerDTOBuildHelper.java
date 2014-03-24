package com.lister.emerge.dto.helper;

import org.broadleafcommerce.core.web.controller.account.UpdateAccountForm;
import org.broadleafcommerce.profile.core.domain.Customer;
import org.broadleafcommerce.profile.web.core.form.RegisterCustomerForm;

import com.lister.emerge.dto.CustomerDTO;
import com.lister.emerge.dto.CustomerDTOBuilder;
/**
 * This is a helper class to build {@link CustomerDTO}. All Event capturing classes
 * should use this helper to build customer dto objects.
 * @author vamsikrishna
 *	
 */
public class CustomerDTOBuildHelper {
	
	public CustomerDTO createCustomerDTO(RegisterCustomerForm customerForm, CustomerDTOBuilder cuDtoBuilder) {
		Customer customer = customerForm.getCustomer();
		// Add more data from customer object
		CustomerDTO customerDTO = cuDtoBuilder.withMemberId(customer.getId())
					.withFirstName(customer.getFirstName())
					.withLastName(customer.getLastName())
					.withEmail1(customer.getEmailAddress()).build();		
		return customerDTO;
	}
	
	/**
	 * User can update only email, firstName and lastName information.
	 * @param updateAccountForm
	 * @param cuDtoBuilder
	 * @return
	 */
	
	public CustomerDTO createCustomerDTO(UpdateAccountForm updateAccountForm, CustomerDTOBuilder cuDtoBuilder) {
		CustomerDTO customerDTO = cuDtoBuilder.withFirstName(updateAccountForm.getFirstName())
					.withLastName(updateAccountForm.getLastName())
					.withEmail1(updateAccountForm.getEmailAddress()).build();		
		return customerDTO;
	}

}
