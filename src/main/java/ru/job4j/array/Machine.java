package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int returnMany = money - price;
        for (int i = size; i < coins.length; i++) {
            while (returnMany >= coins[i]) {
                returnMany -= coins[i];
                result[size] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
