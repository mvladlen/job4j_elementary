package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] < 0 ? 0 : array[i][j];
            }
        }
        return array;
    }
}

