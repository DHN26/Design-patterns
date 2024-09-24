package proxyDesign;

public class Main {
    public static void main(String[] args) {
        String url = "http://example.com";

        File fileDownloader1 = new ProxyClass("admin");
        fileDownloader1.download(url);

        File fileDownloader2 = new ProxyClass("guest");
        fileDownloader2.download(url);
    }
}
