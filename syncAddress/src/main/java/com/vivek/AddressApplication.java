package com.vivek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@EnableAutoConfiguration
public class AddressApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(AddressApplication.class, args);
	}

}