package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void whenTurn1to4() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenTurn1to5() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expect = {5, 4, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenTurnRandom() {
        int[] input =  {4, 1, 6, 2};
        int[] expect = {2, 6, 1, 4};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }

}