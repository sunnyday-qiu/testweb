package com.sunnyday.dao;

import com.sunnyday.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/1
 */
@Repository
public interface CustomerMapper {

    List<Customer> findAll();

    Long add(Customer customer);
}
