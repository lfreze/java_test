package ru.task.point;

public class Run {

  public static void main(String[] args){
    Point point1 = new Point(3, 6);
    Point point2 = new Point(6, 9);
    System.out.println("Result distance = " + Point.distance(point1, point2));
  }

}
