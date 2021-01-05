package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int a = Integer.parseInt(left.replaceAll("[^0-9]", ""));
        int b = Integer.parseInt(right.replaceAll("[^0-9]", ""));
        return Integer.compare(a, b);
    }
}