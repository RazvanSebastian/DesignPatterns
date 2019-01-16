package adapter;

import adapter.employee.Employee;
import adapter.employee.EmployeeLdap;

public class EmployeeLdapAdapter implements Employee {

	private EmployeeLdap instance;

	public EmployeeLdapAdapter(final EmployeeLdap instance) {
		this.instance = instance;
	}

	@Override
	public String getId() {
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
		return instance.getSurname();
	}

	@Override
	public String getLastName() {
		return instance.getGivenname();
	}

	@Override
	public String getEmail() {
		return instance.getMail();
	}

	@Override
	public String toString() {
		return "EmployeeLdapAdapter [instance=" + instance + ", getId()=" + getId() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getEmail()=" + getEmail() + "]";
	}

}
