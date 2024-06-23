package ru.job4j.condition;

public class RectangleArea {
    public static double heightSquare(double p, double k) {
        return p / (2 * (k + 1));
    }

    public static double lengthSquare(double p, double k) {
        return p / (2 * (k + 1)) * k;
    }

    public static void main(String[] args) {
        double result = RectangleArea.heightSquare(6, 2) * RectangleArea.lengthSquare(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
    }
}