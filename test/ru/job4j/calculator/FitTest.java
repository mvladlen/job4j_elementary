package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan170Then80() {
        // Написать свой тест.
        Assert.assertEquals(80.5F, Fit.manWeight((short) 170), 0.01);
    }

    @Test
    public void whenWoman160Then92() {
            short in = 160;
            double expected = 69;
            double out = Fit.manWeight(in);
            Assert.assertEquals(expected, out, 0.01);
        }

    @Test
    public void whenWoman170Then69() {
            // Написать свой тест.
            Assert.assertEquals(69, Fit.womanWeight((short) 170), 0.01);
    }

}