package com.example.university.service.impl;

import com.example.university.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmpServiceImpl implements EmpService {
    private final RestTemplate restTemplate;

    @Autowired
    public EmpServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     *  restTemplate.getForObject(url, Emp.class)
     *  {
     *      name: 'xx',
     *      address: {
     *          street: 'xx'
     *      }
     *  }
     *
     *  class Emp {
     *      private String name;
     *      private Address address;
     *  }
     *  class Address {
     *      private String street;
     *  }
     *
     *  TODO
     *      1. create 2 endpoints
     *          list all employees
     *          list employees whose age larger than 30
     *      2. @ControllerAdvice + @ExceptionHandler -> Exception.class -> internal server error
     *      3. @ControllerAdvice + common response
     */
}
