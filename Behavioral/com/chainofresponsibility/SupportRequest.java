package com.chainofresponsibility;

public class SupportRequest {
	private String issue;
	// 1-Basic, 2-Technical, 3-Billing
	private int complexityLevel;

	public SupportRequest(String issue, int complexityLevel) {
		super();
		this.issue = issue;
		this.complexityLevel = complexityLevel;
	}

	public String getIssue() {
		return issue;
	}

	public int getComplexityLevel() {
		return complexityLevel;
	}

}
