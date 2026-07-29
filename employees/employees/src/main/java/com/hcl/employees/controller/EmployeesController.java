package com.hcl.employees.controller;

import com.hcl.employees.dto.EmployeeDTO;
import com.hcl.employees.service.EmployeesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employess")
public class EmployeesController {
    private final EmployeesService employeesService;
    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping("/all")
    public List<EmployeeDTO> getAllEmployees(){
        return employeesService.getAllEmployees();
    }

  @DeleteMapping("/delect/{id}")
   public String delectEmployees(@PathVariable Long employeeId){
      employeesService.delectEmployee(employeeId);
      return "employee delect successfully";}

  @PutMapping("/update")
  public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO employeeDTO){

  return employeesService.updateEmployee(employeeDTO);}




}
