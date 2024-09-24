package com.adapter;

public class MP4 implements MP4Interface{

	@Override
	public void playVideo(String type) {
		System.out.println("Playing a "+type+" file");
	}

}
