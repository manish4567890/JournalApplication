package com.hcl.employees.dto;

public class EmployeeDTO {

    private Long employeeId;
    private String employeeName;
    private int employeeAge;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Long employeeId, String employeeName, int employeeAge) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge(int employeesAge) {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

}