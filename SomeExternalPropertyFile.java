package com.in28minutes.spring.basics.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalPropertyFile {

	@Value("${extenal.service.url}")
	private String url;

	public String returnUrl() {
		return url;
	}

}
