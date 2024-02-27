package dev.danvega.httpusers;

import dev.danvega.httpusers.user.UserHttpClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class HttpUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpUsersApplication.class, args);
	}


	// add UserHttpClient Bean



}
