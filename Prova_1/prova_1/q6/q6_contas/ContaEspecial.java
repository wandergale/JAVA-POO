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
	
	@Override
	public boolean transferir(ContaCorrente conta, float valor) {
		if (valor <= this.saldo + this.limite) {			
			this.saldo -= valor;
			conta.depositar(valor);
			System.out.println("Transferencia para "
								+conta.getCliente().getNome() 
								+ " realizada com sucesso");
			return true;
		}
		System.out.println("Ocorreu um erro na operação");
		return false;
	}
}
