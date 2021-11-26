package com.example.httpserverclientgenerator;

import com.example.httpserverclientgenerator.example.ExampleRestClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HttpServerClientGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpServerClientGeneratorApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ExampleRestClient exampleRestClient) {
		return args -> {
			System.out.println(exampleRestClient.client().hello());
			System.out.println(exampleRestClient.client().world());
		};
	}

}
