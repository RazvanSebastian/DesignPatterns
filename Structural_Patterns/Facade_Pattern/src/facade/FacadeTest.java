package facade;

import java.util.List;

public class FacadeTest {

	public static void main(String... strings) {
		JdbcFacade jdbcFacade = new JdbcFacade();
		
		jdbcFacade.createtable();
		System.out.println("Table created");
		
		jdbcFacade.insertIntoTable();
		System.out.println("Record inserted");
		
		List<Address> addresses = jdbcFacade.getAddresses();
		for (Address address : addresses) {
			System.out.println(address.toString());
		}
		
		jdbcFacade.closeConnection();
	}

}
