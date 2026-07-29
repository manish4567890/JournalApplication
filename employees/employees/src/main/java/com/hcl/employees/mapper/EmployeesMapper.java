package com.hcl.employees.mapper;

import com.hcl.employees.dto.EmployeeDTO;
import com.hcl.employees.entity.EmployeesEntity;

public class EmployeesMapper {

    public static EmployeeDTO toDTO(EmployeesEntity employeesEntity){

        EmployeeDTO dto = new EmployeeDTO();
        dto.setEmployeeId(employeesEntity.getEmployeesId());
        dto.setEmployeeName(employeesEntity.getEmployeesName());
        dto.getEmployeeAge(employeesEntity.getEmployeesAge());

           return dto; }

    public static EmployeesEntity toEntity(EmployeeDTO employeeDTO) {
        EmployeesEntity employees = new EmployeesEntity();
        employees.setEmployeesId(employeeDTO.getEmployeeId());
        employees.setEmployeesName(employeeDTO.getEmployeeName());
        employees.setEmployeesAge(employees.getEmployeesAge());
    return employees; }

    }

