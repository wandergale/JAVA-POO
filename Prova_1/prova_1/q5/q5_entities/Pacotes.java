package q5_entities;

import q5_comunicacao.Conexao;

public class Pacotes extends Conexao {
	
	public Pacotes() {
		super();
	}
	public Pacotes(String nomeDispositivo) {
		super(nomeDispositivo);
	}

	@Override
	public void enviarDados() {
		if (this.conectado == true) {
			if (this.recebendo == false) {				
				this.enviando = true;
				System.out.println("Enviando dados para "+this.getVisitante().getNomeDispositivo());
				getVisitante().receberDados();
			}
			else {
				System.out.println("Impossivel enviar enquanto estiver recebendo");
			}
		}
		else {
			System.out.println("Conexão necessaria");
		}
	}
	
	@Override
	public void receberDados() {
		if (this.conectado == true) {
			if (this.enviando == false) {				
				this.recebendo = true;
				System.out.println("Recebendo dados de "+this.getVisitante().getNomeDispositivo());
			}
			else {
				System.out.println("Impossivel receber enquanto estiver enviando");
			}
		}
		else {
			System.out.println("Conexão necessaria");
		}
	}
	
}
