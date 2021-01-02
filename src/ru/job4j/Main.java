package ru.job4j;

import ru.job4j.singleton.LoadOrder;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");
        if (args.length < 5) {
            LoadOrder.main();
        }
        LoadOrder.main();
    }
}