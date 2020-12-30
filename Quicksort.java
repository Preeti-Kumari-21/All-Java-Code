package com.in28minutes.spring.basics.springin5minutes.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class Quicksort implements SortAlgorithm{
	
	public int[] sort (int [] numbers) {
		
		return numbers;
	}

}
