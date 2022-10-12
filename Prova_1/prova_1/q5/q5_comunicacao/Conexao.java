package q5_comunicacao;

public abstract class Conexao implements IUFALBluetooth {
	
	private String nomeDispositivo;
	private Conexao visitante;
	protected boolean conectado = false;
	protected boolean enviando = false;
	protected boolean recebendo = false;
	
	public Conexao() {
		setNomeDispositivo(null);
	}
	
	public Conexao(String nomeDispositivo) {
		setNomeDispositivo(nomeDispositivo);
	}
	
	@Override
	public void conectar(Conexao visitante) {
		if (this.conectado == true) {			
			return;
		}
		this.conectado = true;
		setVisitante(visitante);
		System.out.println(this.getNomeDispositivo()+" Conectado com "+this.getVisitante().getNomeDispositivo());
		getVisitante().conectar(this);
		return;		
	}

	@Override
	public abstract void enviarDados();

	@Override
	public void receberDados() {
		if (!this.conectado) {
			System.out.println("Conexão necessaria");
			return;
		}
		this.recebendo = true;
		System.out.println("Recebendo dados de "+this.visitante.getNomeDispositivo());
		return;
	}
	
	@Override
	public void desconectar() {
		if (this.conectado == false) return;
		
		this.conectado = false;
		this.enviando = false;
		this.recebendo = false;
		getVisitante().desconectar();
		setVisitante(null);
	}
	
	public void setNomeDispositivo(String nomeDispositivo) {;
		this.nomeDispositivo = nomeDispositivo;
	}
	
	public String getNomeDispositivo() {
		return this.nomeDispositivo;
	}
	
	public void setVisitante(Conexao visitante) {
		this.visitante = visitante;
	}
	
	public Conexao getVisitante() {
		return this.visitante;
	}
	
	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}

}
