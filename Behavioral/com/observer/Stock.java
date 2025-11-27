package com.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	private String name;
	private double price;
	private List<Observer> observers = new ArrayList<>();

	public Stock(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void subscribe(Observer observer) {
		observers.add(observer);
	}

	public void unsubscribe(Observer observer) {
		observers.remove(observer);
	}

	public void setPrice(double price) {
		this.price = price;
		notifyObservers();
	}

	public void notifyObservers() {
		for (Observer observer : observers)
			observer.update(name, price);
	}
}
