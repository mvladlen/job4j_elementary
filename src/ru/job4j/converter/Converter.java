package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int rubles = 140;
        int euro = Converter.rubleToEuro(rubles);
        int dollar = Converter.rubleToDollar(rubles);
        int euroExpected = 2;
        int dollarExpected = 2;
        boolean testDollar = (dollar == dollarExpected);
        boolean testEuro = (euro == euroExpected);
        System.out.println("140 rubles are " + euro + " euro. Test result " + testEuro);
        System.out.println("140 rubles are " + dollar + " dollar. Test result " + testDollar);
    }
}