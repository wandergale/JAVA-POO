package util;

import entities.Person;
import entities.Payments;

public class ProjectLider extends Person implements Payments {

	public ProjectLider(String name, int age) {
		super(name, age);
		}

	@Override
	public void pay() {
		System.out.printf("Payment received: $ %.2f%n", BASE_SALARY * 3);
	}
	
}
