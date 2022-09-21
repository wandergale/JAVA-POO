package ex4;

public enum Color {
  BLACK(1),
  BLUE(2),
  RED(3);
 
  int colorCode;

  Color(int colorCode) {
    this.colorCode = colorCode;
  }
}