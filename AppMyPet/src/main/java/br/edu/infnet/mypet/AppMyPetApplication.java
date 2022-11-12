package br.edu.infnet.mypet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppMyPetApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppMyPetApplication.class, args);
	}

}
