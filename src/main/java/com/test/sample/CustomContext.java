package com.test.sample;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomContext implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>{
	
	
	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {

		factory.setContextPath("/eurekaClient");
		factory.setPort(8080);
	}
}
