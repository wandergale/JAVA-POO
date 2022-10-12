package q5_comunicacao;

public interface IUFALBluetooth {
	
	public void conectar(Conexao usuario);
	public void enviarDados();
	public void receberDados();
	public void desconectar();
	
}
