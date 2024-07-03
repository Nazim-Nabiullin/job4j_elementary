package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortWith3Numbers() {
        int[] data = new int[] {8, 2, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 6, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortWith5Numbers() {
        int[] data = new int[] {9, 8, 2, 1, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2, 8, 9};
        assertThat(result).containsExactly(expected);
    }
}