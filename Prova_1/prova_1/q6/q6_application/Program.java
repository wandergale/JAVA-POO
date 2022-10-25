package q6_application;

import q6_contas.ContaCorrente;
import q6_contas.ContaEspecial;
import q6_entities.Cliente;

public class Program {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Cristiano");
		Cliente cliente2 = new Cliente("Antony");
		
		cliente1.criarConta(new ContaCorrente(cliente1, 0));
		ContaCorrente cliente1Conta = cliente1.getConta(0);
		System.out.println(cliente1Conta);
		
		cliente2.criarConta(new ContaEspecial(cliente2, 100, 1000));
		ContaCorrente cliente2Conta = cliente2.getConta(0);
		System.out.println(cliente2Conta);
		
		System.out.println();
		
		cliente1Conta.depositar(2500);
		System.out.println(cliente1Conta);
		
		cliente1Conta.transferir(cliente2Conta, 1000);
		System.out.println(cliente2Conta);
		cliente2Conta.sacar(2100);
	}

}
