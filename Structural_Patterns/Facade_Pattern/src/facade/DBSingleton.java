package facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton {

	private static volatile DBSingleton instance = null;
	private static volatile Connection connection = null;

	/*
	 * Making sure if it is using the reflection there will not be another
	 * instantiation
	 */
	private DBSingleton() {

		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (connection != null) {
			throw new RuntimeException("Use getConnection() method to create!");
		}

		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to create!");
		}
	}

	/*
	 * Double lock = if more than one thread invoke the method and the singleton is
	 * not instantiated, make sure the instantiation is threadsafe
	 */
	public static DBSingleton getInstance() {
		if (instance == null) {
			synchronized (DBSingleton.class) {
				if (instance == null) {
					instance = new DBSingleton();
				}
			}
		}

		return instance;
	}

	/*
	 * The method is not static because you must get an instance of the singleton
	 * and then you are able to get an instance of the Connection
	 */
	public Connection getConnection() {
		if (connection == null) {
			synchronized (DBSingleton.class) {
				if (connection == null) {
					try {
						String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
						connection = DriverManager.getConnection(dbUrl);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}

		return connection;
	}

}