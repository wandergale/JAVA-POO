package q3_util;

public class Form implements ILogin {
	
	private String email;
	private String senha;
	
	public Form() {
		setEmail(null);
		setSenha(null);
	}
	
	public Form(String email, String senha) {
		setEmail(email);
		setSenha(senha);
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public void logar() {
		System.out.println("Login realizado com formulário.");
	}
	
}
