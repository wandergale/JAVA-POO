package ex5;

public enum OrderStatus {
  PENDING_PAYMENT(0),
  PROCESSING(1),
  SHIPPED(2),
  DELIVERED(3);

  int orderCode;

  OrderStatus(int orderCode) {
    this.orderCode = orderCode;
  }
}
