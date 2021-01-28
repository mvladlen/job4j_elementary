package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] aSplit = o1.split("/");
        String[] bSplit = o2.split("/");
        if (aSplit[0].compareTo(bSplit[0]) == 0) {
            return o1.compareTo(o2);
        }
        return o2.compareTo(o1);
    }
}