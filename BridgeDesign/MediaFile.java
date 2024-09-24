package bridgeDesign;

public abstract class MediaFile {
	Device device;
	

    public MediaFile(Device device) {
        this.device = device;
    }

    public abstract void play();
}
