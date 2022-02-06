package com.test.springbootsimple;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
//@ComponentScan(basePackages={"controller"})
public class SpringBootSimpleApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringBootSimpleApplication.class);

		SpringApplication.run(SpringBootSimpleApplication.class, args);
	}

}
