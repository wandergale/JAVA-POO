package ex4;

public class Rectangle {
  private double width;
  private double height;

  public void setWidth(double width) {
    this.width = width;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double area() {
    return this.width * this.height;
  }
}
