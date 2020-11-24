package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00toM20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = -2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to03then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 1;
        int x2 = 0;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to2011then2147() {
        float expected = 21.47F;
        int x1 = 1;
        int y1 = 1;
        int x2 = 20;
        int y2 = 11;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when8711toM2011then107() {
        int expected = 107;
        int x1 = 87;
        int y1 = 11;
        int x2 = -20;
        int y2 = 11;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}