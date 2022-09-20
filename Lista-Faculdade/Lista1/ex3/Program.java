package ex3;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         DecimalFormat df = new DecimalFormat("#,###.00");

         Employee emp = new Employee();

         System.out.print("Name: ");
         emp.setName(sc.nextLine());
         System.out.print("Gross salary: ");
         emp.setGrossSalary(sc.nextDouble());
         System.out.print("Tax: ");
         emp.setTax(sc.nextDouble());

         System.out.println();
         System.out.println("Employee: " + emp.getName() + ", $ "+ df.format(emp.NetSalary()));
         System.out.println();
         System.out.print("Which percentage to increase salary? ");
         double percentage = sc.nextDouble();
         emp.increaseSalary(percentage);

         System.out.println();
         System.out.println("Updated data: " + emp.getName()+ ", $ "+ df.format(emp.NetSalary()));
         sc.close();
  }
}