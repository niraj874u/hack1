package com.hackathon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {
  
	 private static final Logger logger = LoggerFactory.getLogger(SpringBootConsoleApplication.class);
	 
	public static void main(String[] args) {
		SpringApplication.run(SpringBootConsoleApplication.class, args);
	}
	
    @Override
    public void run(String... args) throws Exception {

    	   	  logger.info("this is a info message");
    	      logger.warn("this is a warn message");
    	      logger.error("this is a error message");
    	      
    	      
    	// Add your application logic here
        System.out.println("Hello Spring Boot from console!");

    }
}
