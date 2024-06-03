package com.example.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Student {

	private String name;
	private String department;
	private Course course;
	//constr based DI
	// annotation autowired not required
	
	public Student(Course course) {
		super();
		this.course = course;
	}
	
	public String getName() {
		return name;
	}
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	@Value("${student.department}")
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", department=" + department + ", course=" + course + "]";
	}
	
}
