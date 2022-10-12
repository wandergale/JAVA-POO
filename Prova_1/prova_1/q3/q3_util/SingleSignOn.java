package q3_util;

public abstract class SingleSignOn implements ILogin {
	
	private String email;
	private String senha;
	
	public SingleSignOn() {
		setEmail(null);
		setSenha(null);
	}
	
	public SingleSignOn(String email, String senha) {
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

	public abstract void logar();

}
