package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] aSplit = o1.split("/");
        String[] bSplit = o2.split("/");
        int minSize = Math.min(aSplit.length, bSplit.length);
        for (int i = 0; i <= minSize; i++) {
            int aRate = aSplit.length <= i ? 0 : Integer.parseInt(aSplit[i].replaceAll("[^0-9]", ""));
            int bRate = bSplit.length <= i ? 0 : Integer.parseInt(bSplit[i].replaceAll("[^0-9]", ""));
            if (aRate != bRate) {
                if (i == 0) {
                    return Integer.compare(bRate, aRate);
                } else {
                    return Integer.compare(aRate, bRate);
                }
            }
        }
    return 0;
    }
}