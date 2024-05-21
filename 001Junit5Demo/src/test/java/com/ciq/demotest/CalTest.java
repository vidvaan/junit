package com.ciq.demotest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ciq.demo.Cal;

public class CalTest {
	
	private static Cal cal = null;
	
	@BeforeAll
	public static void beforeAll() {
		cal = new Cal();
	}
	
	
	@Test
	public void calTest1() {
		assertEquals(20, cal.sum(10, 10));
	}

}
