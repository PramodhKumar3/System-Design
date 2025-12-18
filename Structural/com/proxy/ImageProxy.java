package com.proxy;

public class ImageProxy implements Image {
	private String fileName;
	private RealImage realImage; // Lazy initialization

	public ImageProxy(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName); // Load only when needed
		}
		realImage.display();
	}
}
