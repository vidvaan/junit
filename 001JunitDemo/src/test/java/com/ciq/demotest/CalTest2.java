package com.ciq.demotest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.ciq.demo.Cal;

@RunWith(Parameterized.class)
public class CalTest2 {

	private static Cal cal = null;

	@BeforeClass
	public static void beforeClass() {
		cal = new Cal();
	}

	private int input1;
	private int input2;
	private int expected;

	public CalTest2(int input1, int input2, int expected) {
		super();
		this.input1 = input1;
		this.input2 = input2;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 2, 2, 4 }, { 3, 3, 6 }, { 0, -1, -1 }, { -2, -2, -4 }, { -3, 1, -2 } });
	}

	@Test
	public void testSum() {
		assertEquals(expected, cal.sum(input1, input2));
	}

}
