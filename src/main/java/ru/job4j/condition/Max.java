package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int middle, int right) {
        return  max(
                left,
                max(middle, right)
        );
    }

    public static int max(int left, int middle, int right, int end) {
        return  max(
                left,
                max(middle,
                        max(right, end)
                )
        );
    }

    public static int summation(int first, int second) {
        int result = first + second;
        return result;
    }
}
