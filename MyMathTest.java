package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {

	@BeforeEach
	public void before() {

		System.out.println("Before");
	}

	@AfterEach
	public void after() {
		System.out.println("After");
	}

	@BeforeAll
	public static void beforeClass() {

		System.out.println("Before class");
	}

	@AfterAll
	public static void afterClass() {

		System.out.println("After class");
	}

	@Test
	public void sum_of_3_numbers() {

		MyMath m = new MyMath();
		int result = m.sum(new int[] { 3, 4, 5 });
		System.out.println("Test1");
		assertEquals(12, result);
	}

	@Test
	public void sum_of_1_numbers() {

		MyMath m = new MyMath();
		int result = m.sum(new int[] { 3 });
		System.out.println("Test2");
		/*
		 * assertEquals(3, result); assertNotNull(object); assertNull(object);
		 * assertAll(executables); assertArrayEquals(expecteds, actuals);
		 */
	}

}
