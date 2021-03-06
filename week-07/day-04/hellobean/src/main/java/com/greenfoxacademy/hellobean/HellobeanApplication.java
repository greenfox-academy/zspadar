package com.greenfoxacademy.hellobean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanApplication implements CommandLineRunner{
	@Autowired
	HelloWorld helloWorld;
	@Autowired
  RedColor redColor;

	public static void main(String[] args) {
		SpringApplication.run(HellobeanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
		redColor.printColor();
	}
}
