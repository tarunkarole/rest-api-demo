package com.tarun.restapi.rest.api.demo.rest;


import com.tarun.restapi.rest.api.demo.dao.EmployeeDao;
import com.tarun.restapi.rest.api.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PrivateKey;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeRestController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }


    @GetMapping("/employees")
    public List<Employee> findAll(){

        return employeeDao.findAll();
    }

}
