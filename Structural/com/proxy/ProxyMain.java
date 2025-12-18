package com.proxy;

public class ProxyMain {
	public static void main(String[] args) {
		Image img1 = new ImageProxy("photo1.jpg");
		Image img2 = new ImageProxy("photo2.jpg");
		Image img3 = new ImageProxy("photo3.jpg");

		System.out.println("Images created, but not loaded yet.");

		// Display images on demand
		img1.display(); // Loads and displays
		img2.display(); // Loads and displays
		img1.display(); // Already loaded, just displays
		img3.display(); // Loads and displays

	}
}
