package com.example.employment.mapper;

import com.example.employment.domain.EmployeeDTO;
import com.example.employment.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeMapper {

    public Employee mapToEmployee(EmployeeDTO employeeDTO) {
        return new Employee(
                employeeDTO.getId(),
                employeeDTO.getFirstName(),
                employeeDTO.getLastName(),
                employeeDTO.getBirthDate(),
                employeeDTO.getPesel()
        );
    }

    public EmployeeDTO mapToEmployeeDTO(Employee employee) {
        return new EmployeeDTO(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getBirthdate(),
                employee.getPesel()
        );
    }

    public List<EmployeeDTO> mapToEmployeeDTOs(final List<Employee> employees) {
        return employees.stream()
                .map(employee -> new EmployeeDTO(
                        employee.getId(),
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getBirthdate(),
                        employee.getPesel()
                ))
                .collect(Collectors.toList());
    }
}
