package com.sunnyday.service;

import com.sunnyday.dao.CustomerMapper;
import com.sunnyday.entity.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/1
 */
@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerMapper customerMapper;

    @Override
    public Long addCustomer(Customer customer) {
        return customerMapper.add(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerMapper.findAll();
    }
}
