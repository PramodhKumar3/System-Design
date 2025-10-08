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

	// Private constructor (only Builder can create PC)
	private PC(PCBuilder builder) {
		this.cpu = builder.cpu;
		this.ram = builder.ram;
		this.powerSupply = builder.powerSupply;
		this.gpu = builder.gpu;
		this.ssd = builder.ssd;
		this.cooling = builder.cooling;
	}

	@Override
	public String toString() {
		return "PC Configurations: [ CPU -> " + cpu + ", RAM -> " + ram + ", Power Supply -> " + powerSupply
				+ ", GPU -> " + (gpu != null ? gpu : "None") + ", SSD -> " + (ssd != null ? ssd : "None")
				+ ", Liquid Cooling -> " + (cooling != null ? cooling : "None") + " ]";
	}

	// Static nested Builder class
	public static class PCBuilder {
		private String cpu;
		private String ram;
		private String powerSupply;
		private String gpu;
		private String ssd;
		private String cooling;

		public PCBuilder() {
			super();
		}

		// Constructor for required fields
		public PCBuilder(String cpu, String ram, String powerSupply) {
			super();
			this.cpu = cpu;
			this.ram = ram;
			this.powerSupply = powerSupply;
		}

		// Setter-style methods for optional fields
		public PCBuilder setGPU(String gpu) {
			this.gpu = gpu;
			return this;
		}

		public PCBuilder setSSD(String ssd) {
			this.ssd = ssd;
			return this;
		}

		public PCBuilder setCooling(String cooling) {
			this.cooling = cooling;
			return this;
		}

		public PC build() throws Exception {
			if (cpu == null || ram == null || powerSupply == null) {
				throw new Exception("CPU, RAM, and Power Supply are required.");
			}
			return new PC(this);
		}
	}
}
