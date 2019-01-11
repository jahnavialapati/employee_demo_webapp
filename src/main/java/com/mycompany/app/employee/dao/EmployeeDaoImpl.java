package com.mycompany.app.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mycompany.app.employee.pojo.Employee;
import com.mycompany.app.sql.SqlQueries;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate template;
	/* (non-Javadoc)
	 * @see com.mycompany.app.employee.dao.EmployeeDao#addNewEmployee(com.mycompany.app.employee.pojo.Employee)
	 */
	public void addNewEmployee(Employee employee)
	{
		template.update(SqlQueries.getInstance().insertEmployee(), new Object[] {employee.getEmpId(),employee.getEmpName(),employee.getSalary()});
	}
	
}
