package entities;

public abstract class Funcionario implements ICalculaSalario {
	
	private String nome;
	private int idade;
	private double salarioBase;
	
	public Funcionario(String nome, int idade, double salarioBase) {
		setNome(nome);
		setIdade(idade);
		setSalarioBase(salarioBase);
	}
	
	
	@Override
	public String toString() {
		return "Nome: " 
				+ getNome() 
				+ ", idade: " 
				+ getIdade()+", ";
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public double getSalarioBase() {
		return salarioBase;
	}



	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
}
