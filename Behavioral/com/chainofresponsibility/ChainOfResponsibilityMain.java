package com.chainofresponsibility;

public class ChainOfResponsibilityMain {
	public static void main(String[] args) {

		SupportHandler level1 = new Level1Support();
		SupportHandler level2 = new Level2Support();
		SupportHandler level3 = new Level3Support();

		// Set up the chain
		level1.setNextHandler(level2);
		level2.setNextHandler(level3);

		// Create requests
		SupportRequest req1 = new SupportRequest("Reset password", 1);
		SupportRequest req2 = new SupportRequest("App crashes on login", 2);
		SupportRequest req3 = new SupportRequest("Refund not processed", 3);
		 // No handler
		SupportRequest req4 = new SupportRequest("Unknown issue", 4);

		// Process requests
		level1.handleRequest(req1);
		level1.handleRequest(req2);
		level1.handleRequest(req3);
		level1.handleRequest(req4);
	}
}