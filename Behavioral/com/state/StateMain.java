package com.state;

public class StateMain {
	public static void main(String[] args) {
		Document doc = new Document();

		doc.edit(); // Editing the draft
		doc.publish(); // Move to Moderation
		doc.edit(); // Cannot edit while in moderation
		doc.publish(); // Publishing document
		doc.archive(); // Archiving published document -> back to Draft
	}

}
