package ru.job4j.array;

import ru.job4j.condition.Max;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int i = 0; i < (Math.min(post.length, word.length)); i++) {
            if (word[word.length - i - 1] != post[post.length - i - 1]) {
                return false;
            }
        }
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        return true;
    }
}
