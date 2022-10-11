package q5_entities;

import q5_comunicacao.Conexao;

public class Pacotes extends Conexao {

	@Override
	public void enviarDados() {
		if (this.conectado) {
			if(!this.recebendo) {				
				this.enviando = true;
				System.out.println("Enviando dados");
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
		if (this.conectado) {
			if (!this.enviando) {				
				this.recebendo = true;
				System.out.println("Recebendo dados");
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
