package com.example.employment.repository;

import com.example.employment.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Override
    Employee save(Employee employee);

    @Override
    List<Employee> findAll();

    @Override
    Optional<Employee> findById(Long id);

    @Override
    void deleteById(Long id);

    //todo update
}
