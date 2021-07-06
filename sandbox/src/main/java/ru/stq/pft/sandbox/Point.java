package ru.stq.pft.sandbox;

public class Point {

  double x;
  double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point p1, Point p2) {
    double d1 = p2.x - p1.x;
    double d2 = p2.y - p1.y;
    return Math.sqrt(Math.pow(d1, 2) + Math.pow(d2, 2));
  }
}
