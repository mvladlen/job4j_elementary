package ru.job4j.oop;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println("go by A-line");
    }

    @Override
    public void stop() {
        System.out.println("stopped on bus stop");
    }
}
