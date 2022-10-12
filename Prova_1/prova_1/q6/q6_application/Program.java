package q6_application;

import q6_contas.ContaCorrente;
import q6_contas.ContaEspecial;
import q6_entities.Cliente;

public class Program {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Cristiano");
		Cliente cliente2 = new Cliente("Ronaldo");
		
		ContaCorrente cc = new ContaCorrente(cliente1);
		ContaCorrente ce = new ContaEspecial(cliente2, 100, 1000);
		
		System.out.println(cc);
		cc.depositar(2500);
		System.out.println(cc);
		
		System.out.println();
		
		System.out.println("Transferencia:");
		cc.transferir(ce, 500);
		System.out.println(cc);
		System.out.println(ce);
		
		System.out.println();
		
		System.out.println("Conta Especial: ");
		ce.sacar(1600);
		System.out.println(ce);
	}

}
