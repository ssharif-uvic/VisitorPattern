package visitor.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person().setFirstName("John").setLastName("Peter").setAge(63));
		persons.add(new Person().setFirstName("Edward").setLastName("Williams").setAge(25));
		persons.add(new Person().setFirstName("Joe").setLastName("Cooper").setAge(10));
		persons.add(new Person().setFirstName("Emmanuel").setLastName("Kingston").setAge(15));

		System.out.println("First Call to process() method");
		new PersonProcessor(persons).process(new PersonVisitor() {
			@Override
			public void processPerson(Person person) {
				System.out.println(person);
			}
		});

		System.out.println("\n\nSecond Call to process() method");
		new PersonProcessor(persons).process((Person person) -> {
				if (person.getAge() > 15) {
					System.out.println(person);
				}
			}
		);
	}
}