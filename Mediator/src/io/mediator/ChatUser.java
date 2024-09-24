package io.mediator;

public class ChatUser implements Collegue{
	private ChatMediator mediator;
	private String name;
	public ChatUser(String name)
	{
		this.name=name;
	}

	@Override
	public void send(String msg) {
		mediator.sendRequest(msg, this);	
	}
	
	 public void setMediator(ChatMediator mediator) {
	        this.mediator = mediator;
	    }

	@Override
	public void receive(String msg, ChatUser sender) {
		 System.out.println(this.name + " received message: '" + msg + "' sent by: " + sender.getName());
	}
	
	public String getName() {
        return name;
    }

}
