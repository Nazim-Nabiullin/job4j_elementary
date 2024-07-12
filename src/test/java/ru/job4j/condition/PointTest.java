package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12to34Then2dot82() {
        double expected = 2.82;
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when23to45Then2dot82() {
        double expected = 2.82;
        int x1 = 2;
        int y1 = 3;
        int x2 = 4;
        int y2 = 5;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus34to56Then8dot24() {
        double expected = 8.24;
        int x1 = -3;
        int y1 = 4;
        int x2 = 5;
        int y2 = 6;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when56to78Then2dot82() {
        Point a = new Point(5, 6);
        Point b = new Point(7, 8);
        a.distance(b);
        double expected = 2.82;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when18to35Then2dot82() {
        Point a = new Point(1, 8);
        Point b = new Point(3, 5);
        a.distance(b);
        double expected = 3.60;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }
}