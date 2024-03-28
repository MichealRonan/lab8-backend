package edu.iu.habahram.ducksservice.controllers;

import edu.iu.habahram.ducksservice.model.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AuthenticationController {

    edu.iu.habahram.ducksservice.repository.customerRepository customerRepository;

    public AuthenticationController(edu.iu.habahram.ducksservice.repository.customerRepository
                                                customerRepository){
        this.customerRepository = customerRepository;
    }

    @PostMapping("/signup")
    public void signup(@RequestBody Customer customer){
        try {
            customerRepository.save(customer);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
