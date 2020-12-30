package com.in28minutes.spring.basics.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

@Named
public class SomeCdiBusiness {
	
//	@Autowired
	//@Inject
	//SomeCdiDao someCdiDao;

/*	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}*/
	
	@Inject
	CdiInterface someCdiDao_Part2;
	

	public int searchnothing(int a,int b)
	{
		System.out.println("Search this ----->");
		someCdiDao_Part2.nothing();
		return 2;
	}


	

	
	
	
	

}
