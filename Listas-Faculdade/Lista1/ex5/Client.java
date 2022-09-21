package ex5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
  private String name;
  private String email;
  private Date birthDate;
  
  Client(String name, String email, Date birthDate) {
    this.name = name;
    this.email = email;
    this.birthDate = birthDate;
  }

  public String getInfos() {
    String birtDate = new SimpleDateFormat("dd/MM/yyyy").format(this.birthDate);
    return this.name+ " "+ "("+birtDate+")" +" " +this.email;
  }

  public String showData() {
    return this.name + this.email;
  }
}
