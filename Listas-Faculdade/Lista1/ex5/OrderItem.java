package ex5;

public class OrderItem {
  private Integer quantity;
  private double price;
  private Object product;

  OrderItem(Integer quantity, double price, Object product) {
    this.quantity = quantity;
    this.price = price;
    this.product = product;
  }

  public static String infos() {
    return "Hello world";
  }

  public Integer getQuantity() {
    return this.quantity;
  }

  public Object getProduct() {
    return this.product;
  }

  public double getPrice() {
    return this.price;
  }

  public double subTotal() {
    return this.quantity * this.price;
  }
}
