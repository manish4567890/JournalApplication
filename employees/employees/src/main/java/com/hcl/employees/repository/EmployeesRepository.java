package com.hcl.employees.repository;

import com.hcl.employees.entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeesRepository extends JpaRepository<EmployeesEntity, Long>{

}
