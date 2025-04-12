package com.example.employee_service;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeManager {

    private final List<Employee> employeeList = new ArrayList<>();

    public EmployeeManager() {
        employeeList.add(new Employee("001", "D", "R", "dr@example.com", "DA"));
        employeeList.add(new Employee("002", "M", "P", "mp@example.com", "SE"));
        employeeList.add(new Employee("003", "D", "P", "dp@example.com", "SE"));
        employeeList.add(new Employee("004", "R", "P", "rp@gmail.com", "BM"));
    }

    public Employees getAllEmployees() {
        return new Employees(employeeList);
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

}