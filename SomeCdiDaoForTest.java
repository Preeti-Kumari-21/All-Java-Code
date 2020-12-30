package com.in28minutes.spring.basics.cdi;

import org.springframework.stereotype.Component;

@Component
public class SomeCdiDaoForTest implements CdiInterfaceForTest {

	@Override
	public int[] getData() {
		return new int[] { 1, 89, 23, 42 };
	}

}
