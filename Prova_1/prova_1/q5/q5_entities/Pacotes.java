package q5_entities;

import q5_comunicacao.Conexao;

public class Pacotes extends Conexao {

	@Override
	public void tratarDados() {
		System.out.println("Enviando dados por Pacotes");
	}
	
	
}
