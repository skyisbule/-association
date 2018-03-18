package com.skyisbule.jxwebsite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.skyisbule.jxwebsite")
public class JxwebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(JxwebsiteApplication.class, args);
	}
}
