package com.template;

public abstract class DataExporter {

	// Template method
	protected final void exportData() {
		fetchData();
		formatData();
		saveToFile();
	}

	private void fetchData() {
		System.out.println("Fetching Data from source...");
	}

	protected abstract void formatData(); // Subclasses will implement this method

	private void saveToFile() {
		System.out.println("Saving formatted data to file...");
	}
}
