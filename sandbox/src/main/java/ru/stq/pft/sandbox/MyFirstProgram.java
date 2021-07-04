package ru.stq.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello();

    Square s = new Square(9);

    Rectangle r = new Rectangle(6, 4);

    System.out.println("Square = " + s.area());

    System.out.println("Rectangle = " + r.area());
  }

  public static void hello() {
    System.out.println("Hello QA!");
  }
}	
