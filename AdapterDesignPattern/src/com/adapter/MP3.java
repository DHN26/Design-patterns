package com.adapter;

public class MP3 implements MediaPlayer{

	@Override
	public void play(String type) {
		System.out.println("Playing "+type+" music.");
	}

}
