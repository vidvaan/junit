package com.ciq.demotest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ciq.demo.Calculation;

public class CalculationTest {
	
	@Test
	public void findMaxTest1() {
		assertEquals(12, Calculation.findMax(new int[] {2,3,12,4,5,6,7}));
	}
	
	@Test
	public void findMaxTest2() {
		assertEquals(-2, Calculation.findMax(new int[] {-2,-3,-12,-4,-5,-6,-7}));
	}
	
	@Test
	public void findMaxTest3() {
		assertEquals(0, Calculation.findMax(new int[] {0,-2,-3,-12,-4,-5,-6,-7}));
	}

}
