package ru.alexeymarino.mvc_hibernate_aop.service;

import ru.alexeymarino.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
     List<Employee> getAllEmployees();
}
