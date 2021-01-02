package com.tarun.restapi.rest.api.demo.dao;

import com.tarun.restapi.rest.api.demo.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> findAll();
}
