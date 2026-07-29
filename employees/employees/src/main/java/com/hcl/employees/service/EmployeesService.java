package com.hcl.employees.service;

import com.hcl.employees.dto.EmployeeDTO;
import com.hcl.employees.entity.EmployeesEntity;
import com.hcl.employees.repository.EmployeesRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeesService {

    private final EmployeesRepository employeesRepository;
    public EmployeesService(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    public List<EmployeeDTO> getAllEmployees() {
        List<EmployeesEntity> employees = employeesRepository.findAll();
        List<EmployeeDTO>  employeesDtoList = new ArrayList<>();
        for(EmployeesEntity employee :employees){

            EmployeeDTO dto = new EmployeeDTO();
            dto.setEmployeeId(employee.getEmployeesId());
            dto.setEmployeeName(employee.getEmployeesName());
            dto.getEmployeeAge(employee.getEmployeesAge());
            employeesDtoList.add(dto);
        }
        return employeesDtoList;
    }

    public void delectEmployee(Long employeeId) {
    }

    public EmployeeDTO updateEmployee( EmployeeDTO employeeDTO) {

        Optional<EmployeesEntity> ee = employeesRepository.findById(employeeDTO.getEmployeeId());
        ee.ifPresent(a -> {

        });
    }
}
