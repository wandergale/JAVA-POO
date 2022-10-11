package q4_util;

import q4_pagamento.Pagamento;

public class Boleto extends Pagamento {

	@Override
	public void realizarPagamento(double valor) {
		System.out.printf("Pagamento de $ %.2f", valor);
		System.out.printf(" realizado via Boleto.%n");
	}

	

}
