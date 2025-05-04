package com.Sem5.PharmEase;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PharmEaseApplication {

	public static void main(String[] args) {
		Dotenv dotenv=Dotenv.load();
		dotenv.entries().forEach(entry->System.setProperty(entry.getKey(),entry.getValue()));
		System.out.println("URL "+System.getProperty("DB_URL"));
		SpringApplication.run(PharmEaseApplication.class, args);
	}

}
