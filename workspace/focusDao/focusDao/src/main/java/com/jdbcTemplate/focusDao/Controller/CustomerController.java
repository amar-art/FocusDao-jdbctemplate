package com.jdbcTemplate.focusDao.Controller;

import com.jdbcTemplate.focusDao.model.Customer;
import com.jdbcTemplate.focusDao.model.CustomerDTO;
import com.jdbcTemplate.focusDao.servise.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


  //  Customer customer=new Customer("mohamed",30);
    @PostMapping("create")
    public void   ajouterCustomer(@RequestBody  Customer customer){

        customerService.add(customer);


    }
    @GetMapping("/{id}")
    public Customer retirer(@PathVariable  int id){

        Customer customer=customerService.trouver(id);
        return customer;

    }

    @GetMapping("/affiche")
    public List<CustomerDTO> afficheTout(){
        List<CustomerDTO> customers=customerService.trouveTout();

        return customers;
    }
}
