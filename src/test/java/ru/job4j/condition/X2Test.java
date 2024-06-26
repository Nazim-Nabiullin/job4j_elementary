package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class X2Test {

    @Test
    void whenA10B0C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int result = X2.calc(a,b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1X1Then40() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 40;
        int result = X2.calc(a,b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA0B1C1X1Then40() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 40;
        int result = X2.calc(a,b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C0X1Then40() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 40;
        int result = X2.calc(a,b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1X0Then40() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 40;
        int result = X2.calc(a,b, c, x);
        assertThat(result).isEqualTo(expected);
    }
}