package ex4;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat; 

public class Program {
  public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         
         System.out.print("Enter the number of shapes: ");
         int shapes = sc.nextInt();
         double[] areas = new double[shapes];
         for (int i = 1; i <= shapes; i++) {
          System.out.println("**Shape #" + i + " data:**");
          System.out.print("Rectangle or Circle (r/c)?");
          sc.nextLine();
          String rc = sc.nextLine();
          // System.out.println(rc.equals("r"));
          if (rc.equals("r")) {
            Rectangle rect = new Rectangle();
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.nextLine();
            rect.setColor(color);
            System.out.println("Enter rectangle width and height:");
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            rect.setWidth(w);
            rect.setHeight(h);
            areas [i-1] = rect.area();
          } else if (rc.equals("c")) {
            Circle circle = new Circle();
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.nextLine();
            circle.setColor(color);
            System.out.println("Enter circle radius:");
            double radius = sc.nextDouble();
            circle.setRadius(radius);            
            areas[i-1] = circle.area();
          }
         }

         DecimalFormat df = new DecimalFormat("#,###.00");
         System.out.println("SHAPE AREAS: ");
         System.out.println("");
         for (double a : areas) {
          System.out.println(df.format(a));
         }
         sc.close();
  }
}
