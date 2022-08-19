package com.mreptin.project.hrassociation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mreptin.project.hrassociation.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
