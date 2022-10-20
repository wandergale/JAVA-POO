package q6_entities;

import q6_contas.ContaEspecial;

public class Cliente {
	private String nome;
	
	public Cliente() {
		setNome(null);
	}
	
	public Cliente(String nome) {
		setNome(nome);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String soString() {
		return "Cliente: "+this.nome;
	}
}
