package com.shrikant.employeecrud.controller;

import java.util.List;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shrikant.employeecrud.dto.EmployeeDTO;
import com.shrikant.employeecrud.entity.Employee;
import com.shrikant.employeecrud.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public EmployeeDTO addEmployee(@Valid @RequestBody EmployeeDTO dto) {
        return employeeService.saveEmployee(dto);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PutMapping
    public EmployeeDTO updateEmployee(@Valid @RequestBody EmployeeDTO dto) {
        return employeeService.updateEmployee(dto);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "Employee deleted successfully";
    }
}
