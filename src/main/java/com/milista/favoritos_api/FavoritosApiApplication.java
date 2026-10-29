package com.milista.favoritos_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FavoritosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FavoritosApiApplication.class, args);
	}

}
