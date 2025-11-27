package com.observer;

public class ObserverMain {
	public static void main(String[] args) {
		Stock stock = new Stock("AAPL", 150.00);

		Investor alice = new Investor("Alice");
		Investor bob = new Investor("Bob");
		Investor charlie = new Investor("Charlie");

		stock.subscribe(alice);
		stock.subscribe(bob);
		stock.subscribe(charlie);

		System.out.println("Updating stock price...");
		stock.setPrice(155.50);

		System.out.println("\nBob unsubscribes...");
		stock.unsubscribe(bob);

		System.out.println("\nUpdating stock price again...");
		stock.setPrice(160.00);
	}
}
