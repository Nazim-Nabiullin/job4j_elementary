package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To3Then3() {
        int left = 2;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To4Then5() {
        int left = 5;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3Then3() {
        int left = 1;
        int middle = 2;
        int right = 3;
        int result = Max.max(left, middle, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3To4Then4() {
        int left = 1;
        int middle = 2;
        int right = 3;
        int end = 4;
        int result = Max.max(left, middle, right, end);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}