package com.senem.enoca.service;

import com.senem.enoca.models.Employee;
import com.senem.enoca.payload.request.EmployeeRequest;
import com.senem.enoca.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService (EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long employeeId) {
        return employeeRepository.findById(employeeId).orElseThrow();
    }

    public void addEmployee(EmployeeRequest employeeRequest) {
        Employee employee = new Employee();
        employee.setEmail(employeeRequest.getEmail());
        employee.setName(employeeRequest.getName());
        employee.setSurname(employeeRequest.getSurname());
        employeeRepository.save(employee);
    }

    public void updateEmployee(EmployeeRequest employeeRequest) {
        Employee employee = new Employee();
        employee.setId(employeeRequest.getId());
        employee.setEmail(employeeRequest.getEmail());
        employee.setName(employeeRequest.getName());
        employee.setSurname(employeeRequest.getSurname());
        employeeRepository.save(employee);
    }

    public void deleteEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow();
        employeeRepository.delete(employee);
    }

}
