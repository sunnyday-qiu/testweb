package com.sunnyday.service;

import com.sunnyday.entity.Customer;

import java.util.List;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/1
 */
public interface CustomerService {

    Long addCustomer(Customer customer);

    List<Customer> findAll();
}
