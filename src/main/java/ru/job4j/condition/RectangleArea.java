package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double resultH = p / (2 * (k + 1));
        double resultL = resultH * k;
        double resultS = resultL * resultH;
        return resultS;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
    }
}