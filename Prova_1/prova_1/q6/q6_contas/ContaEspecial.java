package q6_contas;

import q6_entities.Cliente;

public class ContaEspecial extends ContaCorrente {
	
	private float limite;
	
	public ContaEspecial() {
		super();
	}
	
	public ContaEspecial(Cliente cliente, float limite) {
		super(cliente);
		setLimite(limite);
	}
	public ContaEspecial(Cliente cliente, float saldo, float limite) {
		super(cliente, saldo);
		setLimite(limite);
	}
	
	@Override
	public void sacar(float valor) {
		if (valor <= this.saldo + this.limite) {
			this.saldo -= valor;
			System.out.printf("Saque de %.2f realizado com sucesso%n", valor);
			return;
		}
		System.out.println("Saldo insuficiente");
	}
	
	public void setLimite(float limite) {
		this.limite = limite;
	}
}
