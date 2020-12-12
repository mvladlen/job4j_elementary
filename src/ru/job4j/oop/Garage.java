package ru.job4j.oop;

public class Garage {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle[] garage = {plane, bus, train};
        for (Vehicle vehicle: garage) {
            vehicle.move();
            vehicle.stop();
        }
    }
}
