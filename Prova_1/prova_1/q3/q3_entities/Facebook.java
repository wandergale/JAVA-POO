package q3_entities;

import q3_util.SingleSignOn;

public class Facebook extends SingleSignOn {

	public Facebook() {
		super();
	}
	
	public Facebook(String email, String senha) {
		super(email, senha);
	}
	
	public void logar() {
		System.out.println("Login realizado com Facebook");
	}

}
