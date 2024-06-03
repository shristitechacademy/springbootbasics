package com.example.javabased;

public class Rectangle implements IShape {

	@Override
	public void area(int x, int y) {
		System.out.println("Rect "+(x*y));
	}

}
