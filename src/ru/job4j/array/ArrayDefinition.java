package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("ages has " + ages.length + " elements");
        System.out.println("surnames has " + surnames.length + " elements");
        System.out.println("prices has " + prices.length + " elements");

    }
}
