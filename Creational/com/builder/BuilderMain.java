package com.builder;

public class BuilderMain {

	public static void main(String[] args) {
		try {
			// Gaming PC with optional parameters
			PC gamingPC = new PC.PCBuilder("Intel i9", "32GB", "750W").setGPU("NVIDIA RTX 4080").setSSD("1TB NVMe")
					.setCooling("Liquid Cooling").build();
			System.out.println(gamingPC);

			// Office PC without optional parameters
			PC officePC = new PC.PCBuilder("Intel i5", "16GB", "500W").build();
			System.out.println("\n" + officePC);

			// Office PC without required parameters & optional parameters
			PC noPC = new PC.PCBuilder().build();
			System.out.println("\n" + noPC);

		} catch (Exception e) {
			System.out.println("\n" + e.getMessage());
		}
	}
}