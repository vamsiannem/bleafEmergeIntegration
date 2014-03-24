package com.lister.emerge.dto;


public class CustomerDTOBuilder extends AbstractBuilder<CustomerDTO> {
	private Long memberId;
	private String firstName;
    private String lastName;
    private String email1;
	
	public CustomerDTOBuilder withMemberId(Long memberId){
		this.memberId = memberId;
		return this;
	}
	
	public CustomerDTOBuilder withFirstName(String firstName){
		this.firstName = firstName;
		return this;
	}
	public CustomerDTOBuilder withLastName(String lastName){
		this.lastName = lastName;
		return this;
	}
	public CustomerDTOBuilder withEmail1(String email1){
		this.email1 = email1;
		return this;
	}
	
	
	

}
