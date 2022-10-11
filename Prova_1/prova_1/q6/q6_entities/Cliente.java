package q6_entities;

public class Cliente {
	private String nome;
	
	public Cliente(String nome) {
		setNome(nome);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String soString() {
		return "Cliente: "+this.nome;
	}
}
