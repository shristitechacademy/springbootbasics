package com.example.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

	@Bean
	public Square getSquare() {
		return new Square();
	}
	@Bean
	@Primary
	public Rectangle getRectangle() {
		return new Rectangle();
	}
	@Bean
	public Triangle triangle() {
		return new Triangle();
	}
	
//	@Bean
//	public ShapeFactory factory() {
//		return new ShapeFactory();
//	}
	
	@Bean
	public ShapeFactory factory() {
		ShapeFactory shfactory =  new ShapeFactory();
		shfactory.setShape(triangle());;
		return shfactory;
	}
	
}
