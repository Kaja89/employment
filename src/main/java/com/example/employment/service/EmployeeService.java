package com.example.employment.service;

import com.example.employment.model.Employee;
import com.example.employment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Long deleteEmployee(Long id) {
            this.employeeRepository.deleteById(id);
            //todo
            return id;
    }
}
