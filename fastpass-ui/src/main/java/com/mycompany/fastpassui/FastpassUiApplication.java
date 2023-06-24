package com.mycompany.fastpassui;

import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FastpassUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastpassUiApplication.class, args);
	}

	@Bean
	public Supplier<FastPassToll> generatetollCharge() {
		return () -> new FastPassToll("800", "1001", 1.05f);

	}

}
