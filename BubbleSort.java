package com.in28minutes.spring.basics.springin5minutes.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
//@Primary
public class BubbleSort implements SortAlgorithm {
	
	public int[] sort (int [] numbers) {
		
		return numbers;
	}

}
