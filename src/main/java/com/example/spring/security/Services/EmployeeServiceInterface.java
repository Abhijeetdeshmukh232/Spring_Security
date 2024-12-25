package com.example.spring.security.Services;

import com.example.spring.security.Model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {
     Employee saveEmployeeDetail(Employee emp);
     Optional<Employee> getEmployeeDetail(Long id);
     List<Employee> getAllEmployeeDetail();
}
