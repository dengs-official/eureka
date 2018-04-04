package com.snow.service.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaClient
public class ServiceHomeApplication {

	public static void main(String[] args) {

		// manually input target profiles
		Scanner scan = new Scanner(System.in);
		// input port of service
		String port = scan.nextLine();
		new SpringApplicationBuilder(ServiceHomeApplication.class).properties("server.port="+port).run(args);

		// SpringApplication.run(ServiceHomeApplication.class, args);
	}
}
