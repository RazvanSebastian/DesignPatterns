package adapter;

import java.util.List;

import adapter.employee.Employee;

public class AdapterDemo {

	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		List<Employee> employees = client.getEmployeeList();
		System.out.println(employees);
	}

}
