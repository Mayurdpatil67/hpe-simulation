package com.example.employee_service;

public class Employee {

    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String title;

    public Employee(String employeeId, String firstName, String lastName, String email, String title) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
    }

    // It returns the string representation of the object
    @Override
    public String toString() {
        return "Employee{" +
                "email='" + email + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

}
