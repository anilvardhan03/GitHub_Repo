package com.anil.main;

import com.anil.service.Arithmetic;

public class ApplicationRun {
	public static void main(String[] args) {
		Arithmetic ar = new Arithmetic();
		System.out.println("Sum is :: "+ar.sum(10, 30));
	}
}
