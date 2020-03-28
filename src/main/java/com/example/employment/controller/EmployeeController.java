package com.example.employment.controller;

import com.example.employment.domain.EmployeeDTO;
import com.example.employment.mapper.EmployeeMapper;
import com.example.employment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/app")
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<EmployeeDTO> getEmployees() {
        return employeeMapper.mapToEmployeeDTOs(employeeService.getEmployees());
    }
}
