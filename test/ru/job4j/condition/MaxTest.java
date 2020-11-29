package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2to3Then3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To2to3to4Then4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    public void whenMax4To2to3to1Then4() {
        int result = Max.max(4, 2, 3, 1);
        assertThat(result, is(4));
    }

}
