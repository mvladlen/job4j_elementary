package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        /* for-each */
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            }
        }

        if (rsl > 0) {
            return rsl;
        } else {
            throw new ElementNotFoundException("Element not found");
        }
    }

    public static void main(String[] args) {
        String[] phrase = {"Hello", "world"};
        try {
            indexOf(phrase, "!");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
