package com.in28minutes.spring.basics.cdi;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS )
public class SomeCdiDao_Part2 implements CdiInterface {

	public void nothing() {
		System.out.println("^^^^^^^^^ someCdiDao2 ^^^^^^^^^");
		
	}
	

}
