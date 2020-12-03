package ru.job4j.pojo;

import java.sql.SQLOutput;
import java.text.ParseException;

public class Colege {
    public static void main(String[] args) throws ParseException {
        Student person = new Student();
        person.setFio("Petrov Petr Petrovich");
        person.setGroup("Java J");
        person.setDateParticipate("03.03.2020");
        System.out.println("Student " + person.getFio());
        System.out.println("Group " + person.getGroup());
        System.out.println("Date begin " + person.getDateParticipate());
    }
}
