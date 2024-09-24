package io.mediator;

public interface Collegue {
	void send(String msg);
	void receive(String msg, ChatUser sender);

}
