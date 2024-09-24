package bridgeDesign;

public class AudioFiles extends MediaFile{
	

    public AudioFiles(Device device) {
		super(device);
		// TODO Auto-generated constructor stub
	}


    @Override
    public void play() {
        device.playAudio();
    }

}
