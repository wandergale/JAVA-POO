package entities;

import java.util.ArrayList;
import entities.Carro;

public class Estacionamento {
	
	private ArrayList<Carro> carrosEstacionados;
	
	public Estacionamento() {
		carrosEstacionados = new ArrayList<Carro>();
	}
	
	public void addCarro(Carro carro) {
		carrosEstacionados.add(carro);
	}
	
	public int getLenght() {
		return carrosEstacionados.size(); 
	}
	
	public int getQtyPessoas() {
		int pessoas = 0;
		
		for (Carro carro : carrosEstacionados) {
			pessoas += carro.getQtyPessoas();
		}
		
		return pessoas;
	}
	
	public void getCarros() {
		for (Carro carro : carrosEstacionados) {
			System.out.println(carro.getModelo() + ", "+carro.getQtyPessoas() + " pessoas");
		}
	}
}
