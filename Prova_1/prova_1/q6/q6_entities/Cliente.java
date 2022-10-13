package q6_entities;

import q6_contas.ContaCorrente;
import q6_contas.ContaEspecial;

public class Cliente {
	private String nome;
	private ContaCorrente conta;
	
	public Cliente() {
		setNome(null);
		conta = new ContaCorrente(this, 0);
	}
	
	public Cliente(String nome) {
		setNome(nome);
		conta = new ContaCorrente(this, 0);
	}
	
	public Cliente(String nome, float saldo) {
		setNome(nome);
		conta = new ContaCorrente(this, saldo);
		
	}
	
	public Cliente(String nome, float saldo, float limite) {
		setNome(nome);
		conta = new ContaEspecial(this, saldo, limite);
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
	
	public ContaCorrente getConta() {
		return this.conta;
	}
}
