package com.shristi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.training.Employee;

@SpringBootApplication(scanBasePackages = {"com.shristi","com.example"})
//@ComponentScan(basePackages = {"com.shristi","com.example"})
public class SpringBasicsBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicsBootApplication.class, args);
	}

//	@Autowired
//	private ApplicationContext context;
	
	@Autowired
	private Employee employee;
	@Override
	public void run(String... args) throws Exception {
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//		Employee employee = context.getBean("employee",Employee.class);
//		System.out.println();
		System.out.println(employee);
	}

}
