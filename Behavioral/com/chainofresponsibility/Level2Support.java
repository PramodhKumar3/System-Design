package com.chainofresponsibility;

public class Level2Support implements SupportHandler {
	private SupportHandler nextHandler;

	@Override
	public void setNextHandler(SupportHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(SupportRequest request) {
		if (request.getComplexityLevel() == 2) {
			System.out.println("Level 2 Support handled: " + request.getIssue());
		} else if (nextHandler != null) {
			nextHandler.handleRequest(request);
		} else {
			System.out.println("Request could not be handled.");
		}
	}

}
