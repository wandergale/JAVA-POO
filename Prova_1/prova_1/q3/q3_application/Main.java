package q3_application;

import java.util.Scanner;

import q3_entities.Facebook;
import q3_entities.Google;
import q3_entities.Login;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Realizar LogIn:");
		
		System.out.print("nome:");
		String nome = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Senha: ");
		String senha = sc.nextLine();
		
		System.out.println("");
		Login google = new Google(nome, email, senha);
		System.out.println("");
		Login facebook = new Facebook(nome, email, senha);
		
		sc.close();
	}
}
