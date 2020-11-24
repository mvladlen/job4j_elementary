package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA10B0C0X1Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 1;
        int expected = 10;
        Assert.assertEquals(expected, X2.calc(a, b, c, x));
    }

    @Test
    public void whenA1B1C1X1Then3() { // - a = 1, b = 1, c = 1, x = 1.
        Assert.assertEquals(3, X2.calc(1, 1, 1, 1));
    }

    @Test
    public void whenA0B1C1X1Then2() { // - a = 0, b = 1, c = 1, x = 1.
        Assert.assertEquals(2, X2.calc(0, 1, 1, 1));
    }

    @Test
    public void whenA1B1C0X1Then2() { // - a = 1, b = 1, c = 0, x = 1.
        Assert.assertEquals(2, X2.calc(1, 1, 0, 1));
    }

    @Test
    public void whenA1B1C1X0Then1() { // - a = 1, b = 1, c = 1, x = 0.
        Assert.assertEquals(1, X2.calc(1, 1, 1, 0));
    }
}