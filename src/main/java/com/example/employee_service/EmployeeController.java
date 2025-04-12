package com.example.employee_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeManager employeeManager;

    //private EmployeeManager employeeManager = new EmployeeManager();

    @GetMapping(path = "/get-employees", produces = "application/json")
    public Employees getEmployees() {
        return employeeManager.getAllEmployees();
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public String addEmployee(@RequestBody Employee employee) {
        employeeManager.addEmployee(employee);
        return "Employee addedd !";
    }
}
