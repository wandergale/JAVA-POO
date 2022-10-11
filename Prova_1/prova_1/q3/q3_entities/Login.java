package q3_entities;

public class Login {
	
	private String nome;
	private String email;
	private String senha;
	
	public Login(String nome, String email, String senha) {
		setNome(nome);
		setEmail(email);
		setSenha(senha);
		loginRealizado();
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void loginRealizado() {
		System.out.println("Login realizado");
	}

}
