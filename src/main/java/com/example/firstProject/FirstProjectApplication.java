package com.example.firstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		//System.out.println("first line");
		
		// not required advantage Alien alien = new Alien();
		
		//run method returns configurablecontext object. so wy not hold it.
		
		Alien alien = context.getBean(Alien.class);
		
		alien.show();
		
        Alien alien1 = context.getBean(Alien.class);
		
		alien1.show();
	}

}
