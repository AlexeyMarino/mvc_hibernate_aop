package ru.alexeymarino.mvc_hibernate_aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.alexeymarino.mvc_hibernate_aop.dao.EmployeeDAOImpl;
import ru.alexeymarino.mvc_hibernate_aop.entity.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAOImpl employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}