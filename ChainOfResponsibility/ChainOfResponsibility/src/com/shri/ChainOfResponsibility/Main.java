package com.shri.ChainOfResponsibility;

public class Main {
	public static void main(String[] args) {
		Middleware authen=new AuthenticationMiddleware();
		Middleware author=new AuthorizationMiddleware();
		Middleware log=new LoggingMiddleware();
		Middleware val=new ValidationMiddleware();
		val.linkWith(authen).linkWith(author).linkWith(log);
		if(val.check("user1", "1234657", "admin")) {
			System.out.println("Requested successfully");
		}
		else {
			System.out.println("Request unsuccessful");
			
		}
		if(val.check("user1", "12346", "admin")) {
			System.out.println("Requested successfully");
		}
		else {
			System.out.println("Request unsuccessful");
			
		}
		
		if(val.check("user2", " ", "admin")) {
			System.out.println("Requested successfully");
		}
		else {
			System.out.println("Request unsuccessful");
			
		}
		
		
	}

}
