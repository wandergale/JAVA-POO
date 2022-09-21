package ex5;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

    Client client = new Client(name, email, birthDate);

    System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

    Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();


    for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();

			Product product = new Product(productName, productPrice);

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			OrderItem orderItem = new OrderItem(quantity, productPrice, product);

			order.addItem(orderItem);
		}
    
		System.out.println();
		System.out.println("ORDER SUMMARY:");
    System.out.println("Order moment: "+ order.getDate() + " "+ order.getHour());
    System.out.println("Order status: " + order.getStatus());
    System.out.println("Client: "+ client.getInfos());


    System.out.println("Order items");
    DecimalFormat df = new DecimalFormat("#,###.00");
    for (int item = 0; item < order.li.size(); item++) {
      
      Object o = order.li.get(item);
      OrderItem i = (OrderItem)o;
      Object pn = i.getProduct();
      String productName = ((Product) pn).getName();
      double price = i.getPrice();
      Integer quantity = i.getQuantity();
      double subtotal = i.subTotal();

      System.out.println(productName+", $"+df.format(price)+", Quantity: "+ quantity+", Subtotal: $"+df.format(subtotal));

    }
    System.out.println(df.format(order.totalPrice()));
		
		sc.close();
  }
}
