package q5_application;

import q5_comunicacao.Conexao;
import q5_entities.Pacotes;
import q5_entities.Serial;

public class Program {

	public static void main(String[] args) {
		Conexao user1 = new Serial("S9");
		Conexao user2 = new Serial("A52");
		
		user1.conectar(user2);
		
		System.out.println();
		
		user1.enviarDados();
		
		System.out.println();
		
		user2.enviarDados();
	}

}
