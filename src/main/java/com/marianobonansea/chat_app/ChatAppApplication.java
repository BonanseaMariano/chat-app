package com.marianobonansea.chat_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for the real-time chat application.
 * This class initializes the Spring Boot application.
 * 
 * @author Mariano Bonansea
 * @version 1.0
 */
@SpringBootApplication
public class ChatAppApplication {

	/**
	 * Main method that starts the Spring Boot application.
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ChatAppApplication.class, args);
	}

}
