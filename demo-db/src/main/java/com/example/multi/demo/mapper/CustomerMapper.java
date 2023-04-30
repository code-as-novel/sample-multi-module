package com.example.multi.demo.mapper;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.example.multi.demo.model.Customer;

@Mapper
public interface CustomerMapper {
    Optional<Customer> getCustomer(String id);    
}
