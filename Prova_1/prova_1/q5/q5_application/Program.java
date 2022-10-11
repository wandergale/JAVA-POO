package q5_application;

import q5_comunicacao.Conexao;
import q5_entities.Pacotes;
import q5_entities.Serial;

public class Program {

	public static void main(String[] args) {
		Conexao cx_pacotes = new Pacotes();
		Conexao cx_serial = new Serial();
		
		System.out.println("Conexão por pacotes:");
		cx_pacotes.conectar();
		cx_pacotes.enviarDados();
		cx_pacotes.receberDados();
		
		System.out.println();
		
		System.out.println("Coneão Serial:");
		cx_serial.conectar();
		cx_serial.enviarDados();
		cx_serial.receberDados();
	
	}

}
