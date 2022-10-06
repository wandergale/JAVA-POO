package funcionarios;

import entities.Funcionario;

public class Dev extends Funcionario {

	public Dev(String nome, int idade, double salarioBase) {
		super(nome, idade, salarioBase);
	}

	@Override
	public double calculaSalario() {
		return getSalarioBase();
	}
	
}
