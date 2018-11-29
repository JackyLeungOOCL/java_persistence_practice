package com.tw.apistackbase.application;

import com.tw.apistackbase.core.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
