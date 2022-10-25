package q5_entities;

import q5_comunicacao.Conexao;

public class Serial extends Conexao {
	
	@Override
	public void tratarDados() {
		System.out.println("Enviando dados por Serial");
	}
}
