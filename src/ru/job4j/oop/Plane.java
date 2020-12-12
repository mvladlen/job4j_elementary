package ru.job4j.oop;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Takeoff and fly");
    }

    @Override
    public void stop() {
        System.out.println("Landing");
    }
}
