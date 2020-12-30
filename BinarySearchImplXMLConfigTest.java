package com.in28minutes.spring.basics.springin5minutes.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/testContext.xml")
public class BinarySearchImplXMLConfigTest {

	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void test() {
		int result = binarySearch.binarySearch(new int[] { 1, 2, 3 }, 5);
		assertEquals(3, result);
	}

}
