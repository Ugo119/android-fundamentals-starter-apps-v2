/*
 * Copyright 2018, Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.SimpleCalc;

import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * JUnit4 unit tests for the calculator logic. These are local unit tests; no device needed
 * The @RunWith(JUnit4.class) annotation indicates the runner that will be used to run the tests
 * in this class. A test runner is a library or set of tools that enables testing to occur and
 * the results to be printed to a log
 */
@RunWith(JUnit4.class)
/**
 * The @SmallTest annotation indicates that all the tests in this class are unit tests that have
 * no dependencies, and run in milliseconds.
 */
@SmallTest
public class CalculatorTest {

    private Calculator mCalculator;

    /**
     * Set up the environment for testing
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    /**
     * Test for simple addition
     * The assertThat() method is a JUnit4 assertion that claims the expression in the first
     * argument is equal to the one in the second argument.
     */
    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }

    @Test
    public void addTwoNumbersNegative() {
        double resultAddNegative = mCalculator.add(-2d, 4d);
        assertThat(resultAddNegative, is(equalTo(2d)));
    }

    @Test
    public void subtractNumber() {
        double resultSubtract = mCalculator.sub(2d, 1d);
        assertThat(resultSubtract, is(equalTo(1d)));
    }

    @Test
    public void divideNumber() {
        double resultDivide = mCalculator.div(4d, 2d);
        assertThat(resultDivide, is(equalTo(2d)));
    }

    @Test
    public void multiplyNumbers() {
        double resultMultiply = mCalculator.mul(3d, 3d);
        assertThat(resultMultiply, is(equalTo(9d)));
    }

    @Test
    public void addFloats() {
        double resultAddFloat = mCalculator.add(1.111f, 1.111d);
        assertThat(resultAddFloat, is(closeTo(2.222, 0.01)));
    }

    @Test
    public void divTwoNumbersZero() {
        double resultDiv = mCalculator.div(32d,0);
        assertThat(resultDiv, is(equalTo(Double.POSITIVE_INFINITY)));
    }




}