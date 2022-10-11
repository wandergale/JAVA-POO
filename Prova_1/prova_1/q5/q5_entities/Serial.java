package q5_entities;

import q5_comunicacao.Conexao;

public class Serial extends Conexao {

	@Override
	public void enviarDados() {
		if (this.conectado) {
			this.enviando = true;
			System.out.println("Enviando dados");
		}
		else {
			System.out.println("Conexão necessaria");
		}
	}

	@Override
	public void receberDados() {
		if (this.conectado) {
			this.recebendo = true;
			System.out.println("Recebendo dados");
		}
		else {
			System.out.println("Conexão necessaria");
		}
	}

}
