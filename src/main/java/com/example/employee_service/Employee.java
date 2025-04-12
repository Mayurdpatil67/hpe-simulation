package com.example.employee_service;

public class Employee {

    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String title;

    //for the JSON deserialisation
    public Employee() {
    }

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
        return "Employee{" + "email='" + email + '\'' + ", employeeId='" + employeeId + '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", title='" + title + '\'' + '}';
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
