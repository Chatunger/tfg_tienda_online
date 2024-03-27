package com.tfg.tfg_ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TfgEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TfgEcommerceApplication.class, args);
	}

}
