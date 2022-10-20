package q6_application;

import q6_contas.ContaCorrente;
import q6_contas.ContaEspecial;
import q6_entities.Cliente;

public class Program {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente(new Cliente("Cristiano"));
		ContaCorrente conta2 = new ContaEspecial(new Cliente("Antony"), 0, 1000);
		
		System.out.println(conta1);
		conta1.depositar(1000);
		System.out.println(conta1);
		conta1.sacar(500);
		System.out.println(conta1);
		
		System.out.println();
		
		System.out.println(conta2);
		conta2.depositar(1000);
		System.out.println(conta2);
		conta2.sacar(2000);
		System.out.println(conta2);
		
		System.out.println();
		
		System.out.println("Transferencias:");
		conta1.transferir(conta2, 500);
		System.out.println(conta1);
		System.out.println(conta2);
		
		System.out.println();
		
		conta2.transferir(conta1, 500);
		System.out.println(conta1);
		System.out.println(conta2);
		
	}

}
