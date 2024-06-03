package com.example.javabased;

public class Triangle implements IShape {

	@Override
	public void area(int x, int y) {
		System.out.println("Tri "+(x*x*0.5));
	}

}
