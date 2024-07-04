package ru.job4j.array;

import java.util.Arrays;

public class TwoNumberSun {
    public static int[] getIndexes(int[] array, int target) {
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] + array[right] == target) {
                return new int[] {left, right};
            } else if (array[left] + array[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}
