package com.chainofresponsibility;

public class Level3Support implements SupportHandler {
	private SupportHandler nextHandler;

	@Override
	public void setNextHandler(SupportHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(SupportRequest request) {
		if (request.getComplexityLevel() == 3) {
			System.out.println("Level 3 Support handled: " + request.getIssue());
		} else {
			System.out.println("Request could not be handled.");
		}
	}

}
