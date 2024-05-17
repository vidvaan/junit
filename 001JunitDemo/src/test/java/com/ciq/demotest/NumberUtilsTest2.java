package com.ciq.demotest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.ciq.demo.NumberUtils;

@RunWith(Parameterized.class)
public class NumberUtilsTest2 {

	private int input;
	private boolean expected;

	public NumberUtilsTest2(int input, boolean expected) {
		super();
		this.input = input;
		this.expected = expected;
	}

	// Parameters for the te
	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 2, true }, { 3, false }, { 0, true }, { -2, true }, { -3, false } });
	}

	@Test
	public void isEvenTest1() {
		assertEquals(expected, NumberUtils.isEven(input));
	}

}
