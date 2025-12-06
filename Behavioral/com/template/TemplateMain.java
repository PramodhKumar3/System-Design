package com.template;

public class TemplateMain {
	public static void main(String[] args) {
		DataExporter csvExporter = new CSVExporter();
		DataExporter jsonExporter = new JSONExporter();
		DataExporter xmlExporter = new XMLExporter();

		System.out.println("Exporting CSV:");
		csvExporter.exportData();

		System.out.println("\nExporting JSON:");
		jsonExporter.exportData();

		System.out.println("\nExporting XML:");
		xmlExporter.exportData();
	}
}
