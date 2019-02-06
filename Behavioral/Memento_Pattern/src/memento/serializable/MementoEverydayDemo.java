package memento.serializable;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MementoEverydayDemo {

	private static Employee deserialize() {
		Employee employee = null;
		try {
			FileInputStream fileInputStream = new FileInputStream("employee.ser");
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			employee = (Employee) inputStream.readObject();
			
			inputStream.close();
			fileInputStream.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return employee;

	}

	private static void serrialize(Employee employee) {
		try {
			File file = new File("employee.ser");
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

			outputStream.writeObject(employee);
			outputStream.close();

			fileOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setName("Razvan");
		employee.setAddress("Without address");
		employee.setPhone("112");
		
		serrialize(employee);
		
		Employee deserializedEmployee = deserialize();
		
		System.out.println(deserializedEmployee.toString());

	}

}
