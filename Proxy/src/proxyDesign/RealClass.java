package proxyDesign;

public class RealClass implements File {

	@Override
	public void download(String url) {
		// Simulate the file download process
		System.out.println("Downloading file from " + url);
	}


}
