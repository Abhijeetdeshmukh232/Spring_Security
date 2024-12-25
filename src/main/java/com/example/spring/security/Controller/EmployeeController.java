package com.example.spring.security.Controller;

import com.example.spring.security.Model.Employee;
import com.example.spring.security.Services.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class EmployeeController {

    private EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/get/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id) {
        return employeeService.getEmployeeDetail(id);
    }
    @GetMapping("/get")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployeeDetail();
    }
    @PostMapping("/save")
    public Employee createUser(@RequestBody Employee emp) {
        // Business logic here
        Employee e1 =employeeService.saveEmployeeDetail(emp);
        return e1;
    }
}
