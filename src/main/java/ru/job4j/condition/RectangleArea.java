package ru.job4j.condition;

public class RectangleArea {
    public static double heightSquare(double p, double k) {
        double heightResult = p / (2 * (k + 1));
        return heightResult;

    }

    public static double lengthSquare(double p, double k) {
        double lengtResult = p / (2 * (k + 1)) * k;
        return lengtResult;
    }

    public static void main(String[] args) {
        double result = RectangleArea.heightSquare(6, 2) * RectangleArea.lengthSquare(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
    }
}