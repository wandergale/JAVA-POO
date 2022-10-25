package q5_application;

import q5_comunicacao.Conexao;
import q5_entities.Pacotes;
import q5_entities.Serial;

public class Program {

	public static void main(String[] args) {
		Conexao bluetoothSerial = new Serial();
		bluetoothSerial.conectar();
		bluetoothSerial.tratarDados();
		bluetoothSerial.desconectar();
		
		System.out.println();
		
		Conexao bluetoothPacotes = new Pacotes();
		bluetoothPacotes.conectar();
		bluetoothPacotes.tratarDados();
		bluetoothPacotes.desconectar();
	}

}
