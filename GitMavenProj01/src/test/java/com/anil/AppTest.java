package com.anil;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.anil.service.Arithmetic;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void testwithPositives() {
		Arithmetic ar = new Arithmetic();
		int expected = 40;
		int actual = ar.sum(10, 30); 
		assertEquals(expected, actual);
	}
	@Test
	public void testwithNegitives() {
		Arithmetic ar = new Arithmetic();
		int expected = -40;
		int actual = ar.sum(-10, -30);
		assertEquals(expected, actual);
	}
	@Test
	public void testwithZero() {
		Arithmetic ar = new Arithmetic();
		int expected = 0;
		int actual = ar.sum(0, 0);
		assertEquals(expected, actual);
	}
}
