package logging;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoggingSingleton ls1 = LoggingSingleton.getInstance();	
		System.out.println("Object 1 :"+ls1);
		ls1.info("Processing...");
		ls1.warning("No warnings...");
		ls1.debug("Debugging done right...");
		
		
		System.out.println();
		
		
		LoggingSingleton ls2 = LoggingSingleton.getInstance();	
		System.out.println("Object 2 :"+ls2);
		ls2.info("Processing stopped!");
		ls2.warning("Warning!!");
		ls2.debug("Debugging...");
		
		EagerSingleton e=EagerSingleton.getInstance();
		System.out.println(e);
		EagerSingleton e1=EagerSingleton.getInstance();
		System.out.println(e1);
		
	}

}
