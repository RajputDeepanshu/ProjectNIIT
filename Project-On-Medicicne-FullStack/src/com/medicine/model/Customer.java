
package com.medicine.model;

import java.io.Serializable;
import java.util.UUID;

public class Customer implements Serializable
{
private String customerId;
private String customerName;
private String customerPassword;
private String customerEmail;
private long customerContact;
private String customerGender;
private String securityQuestion;
private String securityAnswer;
private String role="ROLE_USER";




public String getRole() {
	return role;
}


public void setRole(String role) {
	this.role = role;
}


public	Customer()
{
	this.customerId=UUID.randomUUID().toString().substring(0,5);
}


public String getCustomerId() {
	return customerId;
}

public void setCustomerId(String customerId) {
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerPassword() {
	return customerPassword;
}
public void setCustomerPassword(String customerPassword) {
	this.customerPassword = customerPassword;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
public long getCustomerContact() {
	return customerContact;
}
public void setCustomerContact(long customerContact) {
	this.customerContact = customerContact;
}
public String getCustomerGender() {
	return customerGender;
}
public void setCustomerGender(String customerGender) {
	this.customerGender = customerGender;
}

public String getSecurityQuestion() {
	return securityQuestion;
}


public void setSecurityQuestion(String securityQuestion) {
	this.securityQuestion = securityQuestion;
}


public String getSecurityAnswer() {
	return securityAnswer;
}


public void setSecurityAnswer(String securityAnswer) {
	this.securityAnswer = securityAnswer;
}


public String toString()
{
return customerId;	
}


}
