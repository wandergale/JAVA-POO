package q5_entities;

import q5_comunicacao.Conexao;

public class Serial extends Conexao {
	
	public Serial() {
		super();
	}
	
	public Serial(String nomeDispositivo) {
		super(nomeDispositivo);
	}
	
	@Override
	public void enviarDados() {
		if (this.conectado) {
			this.enviando = true;
			System.out.println("Enviando dados para " + this.getVisitante().getNomeDispositivo());
			getVisitante().receberDados();
			return;
		}
		System.out.println("Conexão necessaria");
		return;
	}

}
