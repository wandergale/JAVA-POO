package q3_application;

import q3_entities.Google;
import q3_util.Form;
import q3_util.SingleSignOn;

public class Main {
	
	public static void main(String[] args) {
		
		Form form = new Form("wanderson@outlook.com", "9876");
		form.logar();
		
		SingleSignOn google = new Google("wanderson@gmail.com", "12345");
		google.logar();
	}
}
