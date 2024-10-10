package com.CRUDapi.ApiLabel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiLabelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiLabelApplication.class, args);
		System.out.println("A API está ativa e rodando na porta 8080.");
	}

}
