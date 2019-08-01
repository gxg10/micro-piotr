package com.example.organizationservice.controller;

import com.example.organizationservice.client.DepartmentClient;
import com.example.organizationservice.client.EmployeeClient;
import com.example.organizationservice.model.Employee;
import com.example.organizationservice.repository.OrganizationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrganizationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrganizationController.class);

    @Autowired
    OrganizationRepository repository;

    @Autowired
    DepartmentClient departmentClient;

    @Autowired
    EmployeeClient employeeClient;


    @GetMapping("/test")
    public void test() {
        employeeClient.findByOrganization(2L).forEach(System.out::println);


    }

}
