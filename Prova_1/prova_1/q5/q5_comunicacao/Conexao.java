package q5_comunicacao;

public abstract class Conexao implements IUFALBluetooth {

	@Override
	public void conectar() {
		System.out.println("Conectando...");
	}

	@Override
	public abstract void tratarDados();

	@Override
	public void desconectar() {
		System.out.println("Desconectando...");
	}
	

}
