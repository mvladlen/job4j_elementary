package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int l = 0, r = 0;
        for (int i = 0; i < (left.length + right.length); i++) {
            if (l >= left.length) {
                rsl[i] = right[r];
                r++;
            } else if (r >= right.length) {
                rsl[i] = left[l];
                l++;
            } else if (left[l] < right[r]) {
                rsl[i] = left[l];
                l++;
            } else {
                rsl[i] = right[r];
                r++;
            }
        }
        return rsl;
    }
}