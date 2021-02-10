package br.com.vxtel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.vxtel.controller"})
public class VxtelApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(VxtelApplication.class, args);
	}

}
