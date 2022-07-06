package com.example.demo.controller;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @GetMapping("/emps")
    public String list() {

        Collection<Employee> collection = employeeDao.getAll();

        return "emp/list";
    }

}
