package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class FitTest {

    @Test
    void whenManHeight187ThenWeight100dot05() {
        short height = 187;
        double expected = 100.05;
        double output = Fit.manWeight(height);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWomanHeight187ThenWeight88dot55() {
        short height = 187;
        double expected = 88.55;
        double output = Fit.womanWeight(height);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenManHeight150ThenWeight57dot5() {
        short height = 150;
        double expected = 57.5;
        double output = Fit.manWeight(height);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWomanHeight160ThenWeight57dot5(){
        short height = 160;
        double expected = 57.5;
        double output = Fit.womanWeight(height);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
