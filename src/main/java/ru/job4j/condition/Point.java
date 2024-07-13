package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double result = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
        return result;
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println();

        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        System.out.println(distance);
        System.out.println();

        Point a3 = new Point(0, 0, 0);
        Point b3 = new Point(2, 2, 2);
        System.out.println(a3.distance3d(b3));

    }
}