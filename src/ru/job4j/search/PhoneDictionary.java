package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private final ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : this.persons) {
            if (person.getAddress().equals(key)
                    || person.getName().equals(key)
                    || person.getPhone().equals(key)
                    || person.getSurname().equals(key)) {
                result.add(person);
            }
        }
        return result;
    }
}