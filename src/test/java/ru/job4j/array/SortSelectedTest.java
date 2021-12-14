package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSortArray34125Then12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArray312Then123() {
        int[] data = new int[] {3, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort6842795Then2456789() {
        int[] data = new int[] {6, 8, 4, 2, 7, 9, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }
}