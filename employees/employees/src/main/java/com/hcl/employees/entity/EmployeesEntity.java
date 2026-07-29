package com.hcl.employees.entity;

import jakarta.persistence.Entity;

@Entity
public class EmployeesEntity {
    private long employeesId;
    private String employeesName;
    private int employeesAge;
    private String emailId;

    public EmployeesEntity(long employeesId, String employeesName, int employeesAge,String emailId) {
        this.employeesId = employeesId;
        this.employeesName = employeesName;
        this.employeesAge = employeesAge;
        this.emailId =  emailId;
    }

    public EmployeesEntity() {

    }

    public long getEmployeesId() {
        return employeesId;
    }

    public void setEmployeesId(long employeesId) {
        this.employeesId = employeesId;
    }

    public String getEmployeesName() {
        return employeesName;
    }

    public void setEmployeesName(String employeesName) {
        this.employeesName = employeesName;
    }

    public int getEmployeesAge() {
        return employeesAge;
    }

    public void setEmployeesAge(int employeesAge) {
        this.employeesAge = employeesAge;
    }

    public String getEmail(){
        return emailId; }

    public void setEmail(String emailId){
        this.emailId =emailId;
    }
}
