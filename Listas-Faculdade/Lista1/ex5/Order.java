package ex5;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Order {
 private Date moment;
 private OrderStatus status;
 public ArrayList<Object> li = new ArrayList<>();
  
 Order(Date moment, OrderStatus status, Object client) {
  this.moment = moment;
  this.status = status;
 }
 
 public String getDate() {
  String date = new SimpleDateFormat("dd/MM/yyyy").format(this.moment);
  return date;
 }

 public String getHour() {
  String hour = new SimpleDateFormat("HH:mm:ss").format(this.moment);
  return hour;
 }

 public OrderStatus getStatus() {
  return this.status;
 }

 public void addItem(Object item) {
  this.li.add(item);
 }

 public void removeItem(int item) {
  this.li.remove(item);
 }

 public double totalPrice() {
  double total = 0;
  for (int item = 0; item < li.size(); item++) {
      
    Object o = li.get(item);
    OrderItem i = (OrderItem)o;
    double subtotal = i.subTotal();

    total += subtotal;
  }
  return total;
 }
}
