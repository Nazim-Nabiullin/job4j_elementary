package ru.job4j.array;

import com.sun.security.jgss.GSSUtil;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = !result;
                break;
            }
        }
        return result;
    }
}
