package q4_application;

import java.util.Locale;
import java.util.Scanner;

import q4_pagamento.Pagamento;
import q4_util.Boleto;
import q4_util.Cartao;
import q4_util.PIX;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = 5000.0;
		System.out.printf("Valor conta: $ %.2f%n", valor);
		
		Pagamento pagamento;
		
		System.out.print("Opcão de pagamento (Pix/Boleto/Cartão): ");
		while (true) {
			char op = sc.nextLine().toUpperCase().charAt(0);
			if (op == 'P') {
				pagamento = new PIX();
				pagamento.realizarPagamento(valor);
				break;
			}
			else if (op == 'B') {
				pagamento = new Boleto();
				pagamento.realizarPagamento(valor);
				break;
			}
			else if (op == 'C') {
				pagamento = new Cartao();
				pagamento.realizarPagamento(valor);
				break;
			}
			System.out.print("Digite uma forma de pagamento valida: ");
		}
				
		sc.close();
		
	}

}
