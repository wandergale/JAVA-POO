package application;

import java.util.Locale;

import entities.Carro;
import entities.Estacionamento;

public class Main {

	public static void main(String[] args) {
		Carro car1 = new Carro("BMW M4", 2);
		Carro car2 = new Carro("Hilux", 4);
		Carro car3 = new Carro("Mercedes CLA", 3);
		Carro car4 = new Carro("Honda Civic", 1);
		Carro car5 = new Carro("Renegade", 5);
		
		Estacionamento est = new Estacionamento();
		est.addCarro(car1);
		est.addCarro(car2);
		est.addCarro(car3);
		est.addCarro(car4);
		est.addCarro(car5);
		
		System.out.println("Quantidade de pessoas no Estacionamento: "+est.getQtyPessoas());
		System.out.println();
		
		System.out.println("Carros estacionados:");
		est.getCarros();
		
	}

}
