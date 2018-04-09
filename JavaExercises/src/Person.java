import java.util.ArrayList;

public class Person {


	public void List(String name, int age, String job) {


		PersonDetails p1 = new PersonDetails();
		p1.setFirstName(name);
		p1.setAge(age);
		p1.setJobTitle(job);

		ArrayList<PersonDetails> people = new ArrayList<PersonDetails>();
		people.add(p1);
		//people.add(p2);

		for (PersonDetails object : people) {

			System.out.println(people);

		}
	}




}