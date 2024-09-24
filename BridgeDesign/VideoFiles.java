package bridgeDesign;

public class VideoFiles extends MediaFile{

	public VideoFiles(Device device) {
		super(device);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void play() {
        device.playVideo();
    }

}
