package com.builder;

public class PC {
	// Required parameters
	private String cpu;
	private String ram;
	private String powerSupply;

	// Optional parameters
	private String gpu;
	private String ssd;
	private String cooling;

	// Constructor with all parameters
	public PC(String cpu, String ram, String powerSupply, String gpu, String ssd, String cooling) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.powerSupply = powerSupply;
		this.gpu = gpu;
		this.ssd = ssd;
		this.cooling = cooling;
	}

	@Override
	public String toString() {
		return "PC Configurations: [ CPU -> " + cpu + ", RAM -> " + ram + ", Power Supply -> " + powerSupply
				+ ", GPU -> " + (gpu != null ? gpu : "None") + ", SSD -> " + (ssd != null ? ssd : "None")
				+ ", Liquid Cooling -> " + (cooling != null ? cooling : "None") + " ]";
	}

}
