package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

class StringVsStringBufferVsStringBuilderTest {

	@Test
	void testwithString() {
		String s1 = "Preeti";
		String s2 = "KP";
		
		for (int i = 1; i <= 100000; i++)
		{
			s1 = s1 + s2;
		}
		System.out.println("String value = " + s1);

	}

	@Test
	void testwithStringBuffer() {
		StringBuffer s3 = new StringBuffer();
		String s4 = "Kumar";
		for (int i = 1; i <= 100000; i++) {
			s3.append(s4);
		}
		System.out.println("String value = " + s3);

	}

}
