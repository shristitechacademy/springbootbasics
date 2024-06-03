package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.autowiring.Restaurant;
import com.example.constr.Student;
import com.example.javabased.ShapeFactory;
import com.example.setter.Employee;

@SpringBootApplication
public class SpringBootDiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDiApplication.class, args);
	}
	
	private Employee employee;
	@Autowired
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Autowired 
	private Employee employee1;
	
    private Student student;
	public SpringBootDiApplication(Student student) {
		super();
		this.student = student;
	}
	@Autowired
	private Restaurant restaurant;	
	
	@Autowired
	ShapeFactory factory;

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(employee);
//		System.out.println(employee1);
//		employee.setEmployeeName("Rishi");
//		System.out.println("emp1 "+employee1);
//		System.out.println("emp "+employee);
//		
//		System.out.println(student);
		
//		System.out.println("......Autowiring........."); 
//		restaurant.displayMenu("in").forEach(System.out::println);
//		restaurant.displayMenu("c").forEach(System.out::println);
//		restaurant.displayMenu("ch").forEach(System.out::println);
		
		System.out.println("......Java Based.........");
		factory.printArea(10, 20);
		
	}

}
