package com.healthy.vision;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.healthy")
@EnableSwagger2
@MapperScan("com.healthy.vision.mappers")
public class VisionApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisionApplication.class, args);
	}

}

