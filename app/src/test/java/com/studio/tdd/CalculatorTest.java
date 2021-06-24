package com.studio.tdd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {

    @Test
    public void plus() {
        Calculator calculator = new Calculator();
        assertThat(calculator.plus(1, 2), is(3));
    }
}
