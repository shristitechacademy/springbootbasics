package com.example.javabased;

public class Square implements IShape {

	@Override
	public void area(int x, int y) {
		System.out.println("Sq "+(x*x));
	}

}
