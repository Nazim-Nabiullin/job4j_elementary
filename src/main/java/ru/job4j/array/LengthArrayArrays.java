package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] number = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int i = 0; i < number.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + number[i].length
            );
        }
    }
}
