package facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

	private DBSingleton instance = null;

	public JdbcFacade() {
		instance = DBSingleton.getInstance();
	}

	public int createtable() {
		int count = 0;
		try {
			Connection connection = instance.getConnection();
			Statement statement = connection.createStatement();
			count = statement
					.executeUpdate("create table Address (ID VARCHAR(10), StreetName VARCHAR(20), City VARCHAR(20))");
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count;

	}

	public int insertIntoTable() {
		int count = 0;
		try {
			Connection connection = instance.getConnection();
			Statement statement = connection.createStatement();
			count = statement.executeUpdate("insert into Address (ID, StreetName, City) values ('1','street1','Cluj')");
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count;
	}

	public List<Address> getAddresses() {
		List<Address> addresses = new ArrayList<>();
		try {
			Connection connection = instance.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Address");

			while (resultSet.next()) {
				addresses.add(new Address(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)));
			}

			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return addresses;
	}

	public void closeConnection() {
		try {
			instance.getConnection().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

class Address {
	private String id;
	private String streetName;
	private String city;

	public Address() {
		super();
	}

	public Address(String id, String streetName, String city) {
		super();
		this.id = id;
		this.streetName = streetName;
		this.city = city;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", streetName=" + streetName + ", city=" + city + "]";
	}

}
