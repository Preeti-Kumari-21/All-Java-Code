package com.in28minutes.spring.basics.springin5minutes.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5minutes.SpringIn5MinutesBasicApplication;

//Load the context.
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5MinutesBasicApplication.class)
public class BinarySearchImplTest {

	// Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearchTest;

	@Test
	public void testBinarySearch() {
		// call the method in BinarySearch
		// pass the values
		int actualResult = binarySearchTest.binarySearch(new int[] { 1, 2, 3 }, 5);
		// check if values are matching
		assertEquals(3, actualResult);

	}

}
