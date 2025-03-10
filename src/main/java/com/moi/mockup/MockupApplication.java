package com.moi.mockup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication(exclude = JmxAutoConfiguration.class)
@EnableAutoConfiguration
@Configuration
public class MockupApplication  {

	public static void main(String[] args) {
		SpringApplication.run(MockupApplication.class, args);
	}

}
