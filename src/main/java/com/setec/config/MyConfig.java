package com.setec.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/https://java-api-ysn9.onrender.com")
		.addResourceLocations("file:./myApp/static");
		//.addResourceLocations("file:/opt/myApp/static"); //for Linux
	}
}

