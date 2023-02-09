package com.sunnyday.controller;

import com.sunnyday.entity.Customer;
import com.sunnyday.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/1
 */
@Controller
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public void getAllUsers() {
        List<Customer> customerList = customerService.findAll();
        System.out.println(customerList);
    }

    @PostMapping
    public Long addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
}
