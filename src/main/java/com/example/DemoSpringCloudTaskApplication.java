package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableTask
@Import({ConfigurationApplication.class})
public class DemoSpringCloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudTaskApplication.class, args);
	}
}
