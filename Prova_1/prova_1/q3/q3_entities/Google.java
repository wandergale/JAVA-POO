package q3_entities;

import q3_util.SingleSignOn;

public class Google extends SingleSignOn {

	public Google() {
		super();
	}
	
	public Google(String email, String senha) {
		super(email, senha);
	}

	@Override
	public void logar() {
		System.out.println("Login realizado com Google");
	}

}
