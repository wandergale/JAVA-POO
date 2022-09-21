package ex4;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         Rectangle rect = new Rectangle();
         System.out.println("Enter the number of shapes: ");
         int shapes = sc.nextInt();
         for (int i = 0; i<shapes; i++) {
          
         }
        //  System.out.println("Enter rectangle width and height:");
        //  rect.setWidth(sc.nextDouble());
        //  rect.setHeight(sc.nextDouble());

         System.out.printf("AREA = %.2f%n", rect.area());
         sc.close();
  }
}
