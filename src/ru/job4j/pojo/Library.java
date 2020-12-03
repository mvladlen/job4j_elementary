package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 4);
        Book spaceFiction = new Book("Space Ship", 120);
        Book popular = new Book("Scarlett", 520);
        Book vocabulary = new Book("English", 300);
        Book[] array = new Book[4];
        array[0] = cleanCode;
        array[1] = spaceFiction;
        array[2] = popular;
        array[3] = vocabulary;
        for (int index = 0; index < 4; index++) {
            System.out.println(array[index].getName());
        }
        Book temp;
        temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        for (int index = 0; index < 4; index++) {
            System.out.println(array[index].getName());
        }
        for (int index = 0; index < 4; index++) {
            Book book = array[index];
            if (book.getName().equals("Clean Code")) {
                System.out.println(array[index].getName());

            }
        }

    }
}
