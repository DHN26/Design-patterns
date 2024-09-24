package bridgeDesign;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device windowsDevice = new WindowsDevice();
        MediaFile audioFile = new AudioFiles(windowsDevice);
        MediaFile videoFile = new VideoFiles(windowsDevice);

        audioFile.play();
        videoFile.play();

        System.out.println();
        
        Device macDevice = new MacDevice();
        MediaFile audioFile2 = new AudioFiles(macDevice);
        MediaFile videoFile2 = new VideoFiles(macDevice);

        audioFile2.play();
        videoFile2.play();
	}

}
