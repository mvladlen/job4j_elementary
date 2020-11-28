package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00toM20then2() {
        int expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(-2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to03then2() {
        int expected = 2;
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to2011then2147() {
        float expected = 21.47F;
        Point point1 = new Point(1, 1);
        Point point2 = new Point(20, 11);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when8711toM2011then107() {
        int expected = 107;
        Point point1 = new Point(87, 11);
        Point point2 = new Point(-20, 11);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

}