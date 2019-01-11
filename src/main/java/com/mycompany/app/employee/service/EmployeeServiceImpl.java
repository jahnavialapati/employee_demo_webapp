package com.mycompany.app.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.app.employee.dao.EmployeeDao;
import com.mycompany.app.employee.pojo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDaoImpl;
	
	public void addNewEmployee(Employee employee)
	{
		employeeDaoImpl.addNewEmployee(employee);
	}
}
