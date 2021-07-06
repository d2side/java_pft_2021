package ru.stq.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello();

//    Square s = new Square(9);
//
//    Rectangle r = new Rectangle(6, 4);
//
//    System.out.println("Square = " + s.area());
//
//    System.out.println("Rectangle = " + r.area());

    Point i1 = new Point(7, 9);
    Point i2 = new Point(5, 13);
    System.out.println(i1.distance(i1, i2));
  }

  public static void hello() {
    System.out.println("Hello QA!");
  }


}	
