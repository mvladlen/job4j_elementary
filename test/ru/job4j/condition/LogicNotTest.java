package ru.job4j.condition;

import org.junit.Test;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LogicNotTest {

    @Test
    public void when2isEvenThenT() {
        assertThat(LogicNot.isEven(2), is(true));
    }

    @Test
    public void when3isEvenThenF() {
        assertThat(LogicNot.isEven(3), is(false));
    }

    @Test
    public void when2isNotEvenThenF() {
        assertThat(LogicNot.notEven(2), is(false));
    }

    @Test
    public void when3isNotEven() {
        assertThat(LogicNot.notEven(3), is(true));
    }



/*
    @Test
    public void when2isPositive() {
         int result = Max.max(1, 2);
         assertThat(LogicNot.isPositive(2), true);

        }

    @Test
    public void notEven() {
    }

    @Test
    public void notPositive() {
    }

    @Test
    public void notEvenAndPositive() {
    }

    @Test
    public void evenOrNotPositive() {
    }*/
}