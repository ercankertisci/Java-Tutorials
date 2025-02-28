package example1;

import java.io.*;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private String firstName, lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}