package ex6;

public class Validator implements IEntityValidation {
  
  public static void runValidation() {
    System.out.println("...");
  }

  @Override
  public String isValid(String cpf) {
    String regex = "(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)";
    cpf = cpf.replaceAll(regex, "");

    return cpf;
  }

  public String cleanCpf(String cpf) {
    cpf.replace(".", "");
    cpf.replace("-", "");
    System.out.println("Clean method: "+ cpf);
    return cpf;
  }

}
