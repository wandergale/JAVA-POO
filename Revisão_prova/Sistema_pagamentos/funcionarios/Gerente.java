package funcionarios;

import entities.Funcionario;

public class Gerente extends Funcionario {

	public Gerente(String nome, int idade, double salarioBase) {
		super(nome, idade, salarioBase);
	}

	@Override
	public double calculaSalario() {
		return getSalarioBase() * 15;
	}
}
