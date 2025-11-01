package com.chainofresponsibility;

public interface SupportHandler {
	public void setNextHandler(SupportHandler nextHandler);

	public void handleRequest(SupportRequest request);
}
