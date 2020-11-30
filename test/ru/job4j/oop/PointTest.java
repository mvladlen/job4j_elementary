package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when11to33distance3() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(3, 3);
        assertEquals(p1.distance(p2), 3.0, 0.2);
    }

    @Test
    public void distance3d() {
        Point p1 = new Point(1, 1, 1);
        Point p2 = new Point(3, 3, 5);
        assertEquals(p1.distance3d(p2), 5.0, 0.2);

    }

}