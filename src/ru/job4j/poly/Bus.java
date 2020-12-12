package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("moving on next bus stop");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Pickup " + number + "passengers");
    }

    @Override
    public int fillTank(int volume) {
        int maxTank = 40;
        System.out.println("Filled");
        return Math.max(volume, maxTank);
    }
}
