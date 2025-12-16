package com.facade;

public class MediaConverterFacade {
	private AudioDecoder audioDecoder;
	private VideoDecoder videoDecoder;
	private Compressor compressor;

	public MediaConverterFacade() {
		this.audioDecoder = new AudioDecoder();
		this.videoDecoder = new VideoDecoder();
		this.compressor = new Compressor();
	}

	public void convertMP4toMP3(String fileName) {
		System.out.println("Starting conversion: MP4 → MP3");
		videoDecoder.decodeVideo(fileName);
		audioDecoder.decodeAudio(fileName);
		compressor.compress("MP3");
		System.out.println("Conversion completed successfully!");
	}

}
