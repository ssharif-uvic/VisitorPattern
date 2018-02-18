package visitor.example;

import java.util.List;

public class PersonProcessor {
	private List<Person> persons;

	public PersonProcessor(List<Person> persons) {
		this.persons = persons;
	}

	public void process(PersonVisitor visitor) {
		for (Person person : persons) {
			visitor.processPerson(person);
		}
	}
}

interface PersonVisitor {
	public void processPerson(Person person);
}

class Person {
	private String firstName;
	private String lastName;
	private int age;

	@Override
	public String toString() {
		return "First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age;
	}

	public String getFirstName() {
		return firstName;
	}

	public Person setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public Person setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public int getAge() {
		return age;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}
}