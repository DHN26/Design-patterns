package com.adapter;

public class MediaAdapter implements MediaPlayer{

	private MP4 mp4;
	private VLC vlc;
	public MediaAdapter(String media)
	{
		if(media.equalsIgnoreCase("mp4"))
			mp4=new MP4();
		else if(media.equalsIgnoreCase("vlc"))
			vlc=new VLC();
	}

	@Override
	public void play(String type) {
		if(type.equalsIgnoreCase("mp4"))
		mp4.playVideo("mp4");
		else if(type.equalsIgnoreCase("vlc"))
		vlc.playVideo("vlc");
		else
			System.out.println("Uncompatible type!");
	}

}
