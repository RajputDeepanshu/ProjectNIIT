package com.medicine.dao;

import java.util.List;

import com.medicine.model.Customer;

public interface CustomerMedicine {
public boolean addCustomer(Customer customer);
public boolean updateCustomer(Customer customer);
public boolean deleteCustomer(Customer customer);
public List <Customer> getAllCustomer();
public Customer getCustomerById(String customerId);
public Customer getCustomerByCustomerEmail(String email);
public boolean validate(String email,String password);
}
