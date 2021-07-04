package ru.stq.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello();

    Square s = new Square(9);

    Rectangle r = new Rectangle(6, 4);

    System.out.println("Square = " + area(s));

    System.out.println("Rectangle = " + area(r));
  }

  public static void hello() {
    System.out.println("Hello QA!");
  }

  public static double area(Square s) {
    return s.l * s.l;
  }

  public static double area(Rectangle r) {
    return r.a * r.b;
  }
}	
