package com.snow.config.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Scanner;

@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {
		// manually input target profiles
		Scanner scan = new Scanner(System.in);
		// input port of service
		String port = scan.nextLine();
		new SpringApplicationBuilder(ConfigClientApplication.class).properties("server.port="+port).run(args);
		// SpringApplication.run(ConfigClientApplication.class, args);
	}
}
