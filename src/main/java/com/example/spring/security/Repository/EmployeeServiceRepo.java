package com.example.spring.security.Repository;

import com.example.spring.security.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeServiceRepo extends JpaRepository<Employee, Long> {
}
