package com.example.autowiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	@Autowired
	@Qualifier("chinese")
	IFoodMenu foodMenu;

	@Autowired
	IFoodMenu indian; // autowiring by name

	private IFoodMenu continental;
	public Restaurant(IFoodMenu continental) {
		super();
		this.continental = continental;
	}

	public List<String> displayMenu(String choice) {
		if (choice.equals("ch")) {
			System.out.println("...Chinese Food Menu...");
			return foodMenu.showItems();
		}
		if (choice.equals("in")) {
			System.out.println("...Indian Food Menu...");
			return indian.showItems();
		}
		if (choice.equals("c")) {
			System.out.println("...Continental Food Menu...");
			return continental.showItems();
		}
		return null;
	}
}
