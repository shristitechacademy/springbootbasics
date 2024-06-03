package com.example.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ShapeFactory {

	@Autowired
//	@Qualifier("getSquare")
	private IShape shape;
	
	public void setShape(IShape shape) {
		this.shape = shape;
	}


	public void printArea(int x, int y) {
		shape.area(x,y);
	}
}
