package com.example.spring.security.Services;

import com.example.spring.security.Model.Employee;
import com.example.spring.security.Repository.EmployeeServiceRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {

    private final EmployeeServiceRepo employeeServiceRepo;

    public EmployeeServiceImpl(EmployeeServiceRepo employeeServiceRepo) {
        this.employeeServiceRepo = employeeServiceRepo;
    }
    //@Transactional
    public Employee saveEmployeeDetail(Employee emp){

       Employee x = employeeServiceRepo.save(emp);
        return x;
    }

    @Override
    public Optional<Employee> getEmployeeDetail(Long id) {
        return employeeServiceRepo.findById(id);
    }

    @Override
    public List<Employee> getAllEmployeeDetail() {
        return  employeeServiceRepo.findAll();
    }

    @Override
    public Employee updateEmployeeDetail(Employee emp) {
        return employeeServiceRepo.saveAndFlush(emp);
    }

    @Override
    public String deleteEmployeeDetail(Long id) {
         employeeServiceRepo.deleteById(id);
         return "deleted";
    }

}
