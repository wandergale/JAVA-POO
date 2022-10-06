package application;

import java.util.Locale;
import java.util.Scanner;

import util.Manager;
import util.ProjectLider;
import util.Developer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter user name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter user age: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter user role (m/p/d): ");
		char role = sc.nextLine().charAt(0);
		if (role == 'm') {
			Manager manager = new Manager(name, age);
			manager.pay();
		}
		else if (role == 'p') {
			ProjectLider projectLider = new ProjectLider(name, age);
			projectLider.pay();
		}
		else {
			Developer developer = new Developer(name, age);
			developer.pay();
		}
	
		
		sc.close();
	}

}
