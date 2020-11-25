package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointEqTest {

    @Test
    public void when1212ThenT() {
        assertThat(PointEq.eq(1, 2, 1, 2), is(true));
    }

    @Test
    public void when1132ThenF() {
        assertThat(PointEq.eq(1, 1, 3, 2), is(false));
    }

}