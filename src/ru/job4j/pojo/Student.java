package ru.job4j.pojo;

//import java.text.SimpleDateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String fio;
    private String group;
    private Date dateParticipate;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDateParticipate() {
        return dateParticipate;
    }

    public void setDateParticipate(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        this.dateParticipate = format.parse(date);
    }
}
