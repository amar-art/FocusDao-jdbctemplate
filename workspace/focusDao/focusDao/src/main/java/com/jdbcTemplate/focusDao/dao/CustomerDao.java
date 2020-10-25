package com.jdbcTemplate.focusDao.dao;

import com.jdbcTemplate.focusDao.model.Customer;
import com.jdbcTemplate.focusDao.model.CustomerDTO;

import java.util.List;

public  interface CustomerDao  {

    public   void insert(Customer customer);
    public  Customer findById(int id);
    public List<CustomerDTO> findAll();



}
