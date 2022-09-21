package ex4;

public class Circle extends Shape {
  private double radius;

  public void setRadius(double r) {
    this.radius = r;
  }

  public double area() {
    return Math.PI * (Math.pow(this.radius, 2));
  }
}