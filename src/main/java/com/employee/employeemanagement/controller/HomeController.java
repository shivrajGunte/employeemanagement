package com.employee.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.employeemanagement.model.Employee;
import com.employee.employeemanagement.repository.EmployeeRepository;

@Controller
public class HomeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "index";
    }

    @PostMapping("/employees")
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/";
    }
}
