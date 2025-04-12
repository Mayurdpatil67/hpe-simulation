package com.example.employee_service;

import org.springframework.stereotype.Repository;

import java.util.Arrays;

@Repository
public class EmployeeManager {
    public Employees getAllEmployees() {
        return new Employees(Arrays.asList(
                new Employee("001", "D", "R", "dr@example.com", "DA"),
                new Employee("002", "M", "P", "mp@example.com", "SE"),
                new Employee("003", "D", "P", "dp@example.com", "SE"),
                new Employee("004", "R", "P", "rp@gmail.com", "BM")
        ));
    }
}