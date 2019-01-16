package prototype.shallow;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

	public static void main(String[] args) {
		String sql = "select * from movies where title=?";

		List<String> parameters = new ArrayList<String>();
		parameters.add("Star wars");

		Record record = new Record();

		Statement firstStatement = new Statement(sql, parameters, record);

		System.out.println("Instance = " + firstStatement);
		System.out.println(firstStatement.getSql());
		System.out.println(firstStatement.getParameters());
		System.out.println(firstStatement.getRecord());
		System.out.println();

		try {
			Statement secondStatement = firstStatement.clone();
			System.out.println("Instance = " + secondStatement);
			System.out.println(secondStatement.getSql());
			System.out.println(secondStatement.getParameters());
			System.out.println(secondStatement.getRecord());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
