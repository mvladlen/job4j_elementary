package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
        Assert.assertEquals(Factorial.calc(5),  120);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        Assert.assertEquals(Factorial.calc(0),  1);
    }
}