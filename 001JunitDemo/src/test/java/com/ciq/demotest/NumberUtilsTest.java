package com.ciq.demotest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ciq.demo.NumberUtils;

public class NumberUtilsTest {
	
	@Test
	public void  isEvenTest1() {
		assertEquals(true, NumberUtils.isEven(10));
	}
	
	@Test
	public void  isEvenTest2() {
		assertEquals(false, NumberUtils.isEven(11));
	}
	
	@Test
	public void  isEvenTest3() {
		assertEquals(false, NumberUtils.isEven(1));
	}
	
	@Test
	public void  isEvenTest4() {
		assertEquals(true, NumberUtils.isEven(0));
	}

}
