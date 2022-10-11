package q5_comunicacao;

public abstract class Conexao implements IUFALBluetooth {

	protected boolean conectado = false;
	protected boolean enviando = false;
	protected boolean recebendo = false;
	
	@Override
	public void conectar() {
		if (!this.conectado) {			
			this.conectado = true;
			System.out.println("Conectado");
		} else {
			System.out.println("Ja esta conectado");
		}
	}

	@Override
	public abstract void enviarDados();

	@Override
	public abstract void receberDados();

}
