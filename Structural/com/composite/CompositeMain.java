package com.composite;

public class CompositeMain {
	public static void main(String[] args) {
		// Create files
		File file1 = new File("resume.pdf", 120);
		File file2 = new File("photo.jpg", 500);
		File file3 = new File("notes.txt", 80);

		// Create folders
		Folder docsFolder = new Folder("Documents");
		Folder imagesFolder = new Folder("Images");
		Folder rootFolder = new Folder("Root");

		// Build hierarchy
		docsFolder.addComponent(file1);
		docsFolder.addComponent(file3);
		imagesFolder.addComponent(file2);
		rootFolder.addComponent(docsFolder);
		rootFolder.addComponent(imagesFolder);

		// Display structure
		rootFolder.display("");

		// Show total size
		System.out.println("\nTotal Size of Root Folder: " + rootFolder.getSize() + "KB");
	}
}
