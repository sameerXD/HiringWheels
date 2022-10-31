package org.ncu.hirewheels;

import org.ncu.hirewheels.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//@ComponentScan(basePackageClasses = UserController.class)
public class HireWheelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HireWheelsApplication.class, args);
	}

}
