package com.ciq.demotest;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.ciq.demo.Cal;

public class CalTest {

	private static Cal cal = null;

	@BeforeClass
	public static void beforeClass() {
		cal = new Cal();
	}

	@Test(timeout = 1000)
	@Ignore
	public void sumTest1() {
		int a = 20;
		int b = 30;
		int expResult = 50;
		int accResult = cal.sum(a, b);
		assertEquals(expResult, accResult);
	}

	@Test
	public void sumTest2() {
		assertEquals(60, cal.sum(30, 30));
	}

	@Test
	public void sumTest3() {
		assertEquals(50, cal.sum(100, -50));
	}

	@Test
	public void sumTest4() {
		assertEquals(30, cal.sum(-100, 130));
	}

	@Test
	public void sumTest5() {
		assertEquals(-150, cal.sum(-100, -50));
	}

}
