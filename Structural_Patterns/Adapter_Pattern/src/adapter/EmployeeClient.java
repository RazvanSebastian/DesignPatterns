package adapter;

import java.util.ArrayList;
import java.util.List;

import adapter.employee.Employee;
import adapter.employee.EmployeeDB;
import adapter.employee.EmployeeLdap;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();

		Employee employeeFromDB = new EmployeeDB("132", "firstName", "lastName", "email");
		employees.add(employeeFromDB);

		EmployeeLdap employeeLdap = new EmployeeLdap("4234", "surname", "givenname", "mail");
		employees.add(new EmployeeLdapAdapter(employeeLdap));

		return employees;
	}

}
