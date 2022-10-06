package util;

import entities.Person;
import entities.Payments;

public class Developer extends Person implements Payments {
	
	public Developer(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void pay() {
		System.out.printf("Payment received: $ %.2f%n", BASE_SALARY);
	}
}
