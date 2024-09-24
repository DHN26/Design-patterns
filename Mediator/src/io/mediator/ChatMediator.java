package io.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {
	List<ChatUser> users = new ArrayList<>();

	public void addUser(ChatUser user) {
		users.add(user);
		user.setMediator(this);
	}

	@Override
	public void sendRequest(String msg, ChatUser sender) {

		for (ChatUser user : users) {
            if (user != sender) {
                user.receive(msg, sender);
            }
        }

	}

}
