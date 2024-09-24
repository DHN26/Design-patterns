package proxyDesign;


	import java.util.ArrayList;
	import java.util.List;

	public class ProxyClass implements File {
	    private RealClass realFileDownloader;
	    private List<String> authorizedUsers;
	    private String currentUser;

	    public ProxyClass(String currentUser) {
	        this.realFileDownloader = new RealClass();
	        this.authorizedUsers = new ArrayList<>();
	        this.currentUser = currentUser;

	        // Add some authorized users for demonstration purposes
	        authorizedUsers.add("admin");
	        authorizedUsers.add("user1");
	        authorizedUsers.add("user2");
	    }

	    @Override
	    public void download(String url) {
	        if (isUserAuthorized()) {
	            logAccess(url);
	            realFileDownloader.download(url);
	        } else {
	            System.out.println("Access denied for user: " + currentUser);
	        }
	    }

	    private boolean isUserAuthorized() {
	        return authorizedUsers.contains(currentUser);
	    }

	    private void logAccess(String url) {
	        System.out.println("User " + currentUser + " is downloading a file from " + url);
	    }
	


}
