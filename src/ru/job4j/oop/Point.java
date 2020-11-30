package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;

    private int y;

    private int z;

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     * @param third координата y
     */

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public void info() {
        System.out.printf("Point[%s, %s]%n", this.x, this.y);
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }
}