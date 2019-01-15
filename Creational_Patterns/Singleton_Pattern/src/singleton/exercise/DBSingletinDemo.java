package singleton.exercise;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSingletinDemo {

	public static void main(String... strings) {
		DBSingleton instance = DBSingleton.getInstance();

		long timeBefore = 0;
		long timeAfter = 0;

		timeBefore = System.currentTimeMillis();
		Connection connection = instance.getConnection();
		timeAfter = System.currentTimeMillis();

		System.out.println("Time to connect = " + (timeAfter - timeBefore));

		Statement statement;
		try {
			statement = connection.createStatement();
			int count = statement
					.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");

			System.out.println("Table created!");
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		timeBefore = System.currentTimeMillis();
		connection = instance.getConnection();
		timeAfter = System.currentTimeMillis();

		/*
		 * Here the time is 0 because in our singleton we already have the instance of
		 * connection object
		 */
		System.out.println("Time to connect = " + (timeAfter - timeBefore));
	}

}
