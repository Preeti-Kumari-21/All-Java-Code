package com.in28minutes.spring.basics.cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessForTest_Mockito {

	@InjectMocks
	SomeCDIBusinessForTest cdiBusiness;

	@Mock
	SomeCdiDaoForTest cdiDaoForTest;

	@Test
	public void testForFindGreatestNumber() {
		
		Mockito.when(cdiDaoForTest.getData()).thenReturn(new int[] { 2, 4, 89, 100 });
		assertEquals(100, cdiBusiness.findGreatestNumber());
	}

	@Test
	public void testForFindGreatestNumber_NoValues() {
		Mockito.when(cdiDaoForTest.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, cdiBusiness.findGreatestNumber());
	}

	@Test
	public void testForFindGreatestNumber_withEqualValues() {
		Mockito.when(cdiDaoForTest.getData()).thenReturn(new int[] { 2, 2, 2 });
		assertEquals(2, cdiBusiness.findGreatestNumber());
	}

}
