package ex3;

public class Employee {
  private String name;
  private double grossSalary;
  private double tax;

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setGrossSalary(double grossSalary) {
    this.grossSalary = grossSalary;
  }
  public void setTax(double tax) {
    this.tax = tax;
  }

  public double NetSalary() {
    return this.grossSalary - this.tax;
  }

  public void increaseSalary(double percentage) {
    double percent = (percentage/100) + 1;
    this.grossSalary *= percent;
  }
}
