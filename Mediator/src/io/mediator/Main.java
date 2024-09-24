package io.mediator;

public class Main {

	public static void main(String[] args) {
		ChatMediator mediator=new ChatMediator();
		
		ChatUser user1 = new ChatUser("Pooo");
        ChatUser user2 = new ChatUser("Tigress");
        ChatUser user3 = new ChatUser("Shifu");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        
        user1.send("Helloo");
        user2.send("Dragon warrior");
		
	}

}
