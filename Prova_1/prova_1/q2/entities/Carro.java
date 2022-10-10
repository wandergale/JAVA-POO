package entities;

public class Carro {
	private String modelo;
	private int qtyPessoas;
	
	public Carro(String modelo, int qtyPessoas) {
		this.modelo = modelo;
		this.qtyPessoas = qtyPessoas;
	}

	public int getQtyPessoas() {
		return qtyPessoas;
	}
	
	public String getModelo() {
		return modelo;
	}
	

}
