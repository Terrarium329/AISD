package zad3;
import zad2.Square;

import java.lang.Math;

public class Point {
    double x;
    double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point otherPoint){

        double wynik = Math.sqrt(Math.pow(otherPoint.x - this.x,2) + Math.pow(otherPoint.y - this.y,2));
        return wynik;

    }

    public static void main(String[] args){

        Point p1 = new Point(1.0,1.0);
        Point p2 = new Point(2.0,2.0);

        System.out.println(p1.distance(p2));


    }


}
