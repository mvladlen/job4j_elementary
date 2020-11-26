package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Petr Arsentev";
        names[1] = "Petr Petrov";
        names[2] = "Ivan Ivanov";
        names[3] = "Sidor Sidorov";

        System.out.println("ages has " + ages.length + " elements");
        System.out.println("surnames has " + surnames.length + " elements");
        System.out.println("prices has " + prices.length + " elements");

        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}
