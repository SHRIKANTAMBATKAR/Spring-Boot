package com.shrikant.employeecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shrikant.employeecrud.dao.EmployeeDao;
import com.shrikant.employeecrud.entity.Employee;
import com.shrikant.employeecrud.exception.EmployeeNotFoundException;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Employee saveEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        if (!employeeDao.existsById(employee.getId())) {
            throw new EmployeeNotFoundException("Employee not found with id: " + employee.getId());
        }
        return employeeDao.save(employee);
    }

    public void deleteEmployee(Long id) {
        if (!employeeDao.existsById(id)) {
            throw new EmployeeNotFoundException("Employee not found with id: " + id);
        }
        employeeDao.deleteById(id);
    }
}
