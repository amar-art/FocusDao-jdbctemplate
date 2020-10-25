package com.jdbcTemplate.focusDao.servise;


import com.jdbcTemplate.focusDao.dao.CustomerDaoImpl;
import com.jdbcTemplate.focusDao.model.Customer;
import com.jdbcTemplate.focusDao.model.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private CustomerDaoImpl customerDaoImpl;

    @Autowired
    public CustomerService(CustomerDaoImpl customerDaoImpl) {
        this.customerDaoImpl = customerDaoImpl;
    }

    public void add(Customer customer){

        customerDaoImpl.insert(customer);
    }

    public Customer trouver(int id){
        Customer customer=customerDaoImpl.findById(id);

        return  customer;
    }
     public List<CustomerDTO> trouveTout(){
        List<CustomerDTO> customers=new ArrayList<>();
        customers=customerDaoImpl.findAll();
        return customers;
     }
}
