package com.adapter;

public class Main {

	public static void main(String[] args) {
		MediaPlayer media=new MP3();
		media.play("mp3");
		
		MediaPlayer media2=new MediaAdapter("vlc");
		media2.play("vlc");
	}

}
