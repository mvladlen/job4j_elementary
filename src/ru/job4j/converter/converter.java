package ru.job4j.converter;

public class converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value/60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int rubles = 140;
        int euro = converter.rubleToEuro(rubles);
        int dollar = converter.rubleToDollar(rubles);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
    }
}