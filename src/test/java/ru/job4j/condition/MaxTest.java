package ru.job4j.condition;

import org.hamcrest.Condition;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax3To2Then3() {
        int first = 3;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To3Then3() {
        int first = 1;
        int second = 3;
        int result = Max.max(first, second);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int first = 4;
        int second = 4;
        int result = Max.max(first, second);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}