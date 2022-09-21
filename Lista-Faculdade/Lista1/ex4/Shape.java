package ex4;

abstract class Shape {

  public void setColor(String color) {
    Color.valueOf(color);
  }
  abstract public double area();
}
