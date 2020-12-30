package com.in28minutes.spring.basics.springin5minutes.basic;

//import javax.annotation.PostConstruct;

//import javax.annotation.PreDestroy;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	//@Qualifier("quick")
	SortAlgorithm quicksort;
	
	
	/*
	 * public BinarySearchImpl(SortAlgorithm sortAlgorithm) { super();
	 * this.sortAlgorithm = sortAlgorithm; }
	 */
	/*
	 * public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
	 * this.sortAlgorithm = sortAlgorithm; }
	 */
	

	public int binarySearch (int [] numbers, int numberToSearch)
	{
		int []sortedArray = quicksort.sort(numbers);
		System.out.println(quicksort);
		
		return 3;
	}


	/*
	 * @PostConstruct public void postConstruct() { LOGGER.info("postConstruct"); }
	 * 
	 * @PreDestroy public void preDestroy() { LOGGER.info("preDestroy"); }
	 */

}
