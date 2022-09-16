public class Person {
  String name;
  String age;
  
  Person(String name, String age) {
    this.name = name;
    this.age = age;
  }
  public static void main(String[] args) {
    Person ps = new Person("Wanderson", "20");
    System.out.println(ps.name);
  }
}