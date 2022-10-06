package funcionarios;

import entities.Funcionario;

public class LiderProjeto extends Funcionario {
	
	public LiderProjeto(String nome, int idade, double salarioBase) {
		super(nome, idade, salarioBase);
	}

	@Override
	public double calculaSalario() {
		return getSalarioBase() * 3;
	}
}
