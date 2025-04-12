package com.example.employee_service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeManagerTest {

    private EmployeeManager employeeManager;

    @BeforeEach
    public void setup() {
        employeeManager = new EmployeeManager();
    }

    @Test
    public void testGetAllEmployees() {
        Employees employees = employeeManager.getAllEmployees();
        assertEquals(4, employees.getEmployeeList().size(), "Should return 4 initial employees");
    }

    @Test
    public void testAddEmployee() {
        Employee newEmp = new Employee("005", "John", "Doe", "john.doe@example.com", "Tester");
        employeeManager.addEmployee(newEmp);

        Employees employees = employeeManager.getAllEmployees();
        assertEquals(5, employees.getEmployeeList().size(), "Should contain 5 employees after adding one");
        assertTrue(employees.getEmployeeList().contains(newEmp), "List should contain the newly added employee");
    }
}
