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
		int expected = 60;
		int actual = ar.sum(30, 30);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testwithNegitives() {
		Arithmetic ar = new Arithmetic();
		int expected = -20;
		int actual = ar.sum(-10, -10);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testwithZeros() {
		Arithmetic ar = new Arithmetic();
		int expected = 00;
		int actual = ar.sum(00, 00);
		assertEquals(expected, actual);
	}
}
