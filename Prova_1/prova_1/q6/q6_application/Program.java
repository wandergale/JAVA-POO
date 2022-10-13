package q6_application;

import q6_contas.ContaCorrente;
import q6_contas.ContaEspecial;
import q6_entities.Cliente;

public class Program {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Cristiano");
		Cliente cliente2 = new Cliente("Ronaldo", 0, 1000);
		
		System.out.println(cliente1.getConta());
		cliente1.getConta().depositar(1000);
		System.out.println(cliente1.getConta());
		cliente1.getConta().sacar(500);
		System.out.println(cliente1.getConta());
		
		System.out.println();
		
		System.out.println(cliente2.getConta());
		cliente2.getConta().depositar(1000);
		System.out.println(cliente2.getConta());
		cliente2.getConta().sacar(2000);
		System.out.println(cliente2.getConta());
		
	}

}
