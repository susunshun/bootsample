package com.sample.controller;

import com.sample.domain.Customer;
import com.sample.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by susunshun on 2016/10/23.
 */

@RestController
@RequestMapping("api/customers")
public class CustomerRestController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    List<Customer> getCustomer(){
        List<Customer> customers = customerService.findAll();
        return customers;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    Customer getCustomer(@PathVariable Integer id){
        Customer customer = customerService.findOne(id);
        return customer;
    }

    @RequestMapping(method = RequestMethod.POST)
    Customer postCustomer(@RequestBody Customer customer){
        return customerService.create(customer);
    }

    @RequestMapping(value = "{id}" , method = RequestMethod.PUT)
    Customer putCustomer(@PathVariable Integer id, @RequestBody Customer customer){
        customer.setId(id);
        return customerService.update(customer);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteCustomer(@PathVariable Integer id){
        customerService.delete(id);
    }

}
