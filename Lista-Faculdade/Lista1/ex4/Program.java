package ex4;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         
         System.out.println("Enter the number of shapes: ");
         int shapes = sc.nextInt();
         double[] areas = new double[shapes];
        // Rectangle rect = new Rectangle();
        // double w = sc.nextDouble();
        // double h = sc.nextDouble();
        // rect.setWidth(w);
        // rect.setHeight(h);
        // double area = rect.area();
        // System.out.println(area);
        // areas [0] = rect.area();
         ShapeProgram sh = new ShapeProgram();
         for (int i = 0; i < areas.length; i++) {
          sh.createShape();
          String rc = sc.nextLine();
          System.out.print(rc);
         }
         sc.close();
  }
}
