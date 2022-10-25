package q6_entities;

import java.util.ArrayList;

import q6_contas.ContaCorrente;

public class Cliente {
	private String nome;
	ArrayList<ContaCorrente> contas;
	
	public Cliente() {
		setNome(null);
		contas = new ArrayList<ContaCorrente>();
	}
	
	public Cliente(String nome) {
		setNome(nome);
		contas = new ArrayList<ContaCorrente>();
	}
	
	public void criarConta(ContaCorrente conta) {
		contas.add(conta);
	}
	
	public ContaCorrente getConta(int pos) {
		return contas.get(pos);
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
