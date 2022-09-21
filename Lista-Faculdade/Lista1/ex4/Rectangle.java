package ex4;

public class Rectangle extends Shape {
  private double width;
  private double height;

  public void setWidth(double w) {
    this.width = w;
  }
  public void setHeight(double h) {
    this.height = h;
  }

  public double area() {
    return this.width * this.height;
  }
}
