package com.in28minutes.spring.basics.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeCDIBusinessForTest {

	@Autowired
	SomeCdiDaoForTest cdiDaoForTest;

	public int findGreatestNumber() {
		int[] arrayOfNumbers = cdiDaoForTest.getData();
		int greatest = Integer.MIN_VALUE;
		for (int value : arrayOfNumbers) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}

}
