package q6_contas;

import q6_entities.Cliente;

public class ContaCorrente {
	private Cliente cliente;
	protected float saldo;

	
	public ContaCorrente() {
		this.cliente = new Cliente();
		setSaldo(0);
	}
	
	public ContaCorrente(Cliente cliente) {
		setCliente(cliente);
		setSaldo(0);
	}
	
	public ContaCorrente(Cliente cliente, float saldo) {
		setCliente(cliente);
		setSaldo(saldo);
	}
	
	public void depositar(float valor) {
		this.saldo += valor;
	}
	
	public void sacar(float valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.printf("Saque de %.2f realizado com sucesso", valor);
			return;
		}
		System.out.println("Saldo insuficiente");
	}
	
	public String toString() {
		return "Cliente: "+cliente.getNome()+", saldo: $ "+String.format("%.2f", this.saldo);
	}
	
	public boolean transferir(ContaCorrente conta, float valor) {
		if (this.saldo >= valor) {			
			this.saldo -= valor;
			conta.depositar(valor);
			System.out.println("Transferencia para "+conta.cliente.getNome() +" realizada com sucesso");
			return true;
		}
		System.out.println("Ocorreu um erro na operação");
		return false;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
