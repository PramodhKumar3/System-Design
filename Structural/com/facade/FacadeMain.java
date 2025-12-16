package com.facade;

public class FacadeMain {
	public static void main(String[] args) {
		MediaConverterFacade converter = new MediaConverterFacade();
		converter.convertMP4toMP3("movie.mp4");
	}
}
