package application;

import java.util.Locale;

import entities.Funcionario;
import entities.ICalculaSalario;
import funcionarios.Dev;
import funcionarios.Gerente;
import funcionarios.LiderProjeto;

public class Program {
	
	private final static double SALARIO_BASE = 1000.0;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		Funcionario dev = new Dev("Wanderson", 20, SALARIO_BASE),
					gerente = new Gerente("João", 40, SALARIO_BASE),
					lider = new LiderProjeto("Ana", 25, SALARIO_BASE);
	
		calculaSalario(dev);
		calculaSalario(gerente);
		calculaSalario(lider);
	}
	
	
	public static void calculaSalario(ICalculaSalario s) {
		System.out.printf(s+"Salario final = $ %.2f%n", s.calculaSalario());
	}

}
