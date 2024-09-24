package io.mediator;

public interface Mediator {
	 void sendRequest(String msg, ChatUser user);
	 void addUser(ChatUser user);
}
