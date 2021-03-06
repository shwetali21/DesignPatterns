package com.java.designpattern.behavioral.mediator;

/**Chat application - ChatClient that has a mediator and add users to the group and one of the user will send a message.*/
public class ChatClient {
	public static void main(String[] args) {

		ChatMediator mediator = new ChatMediatorImpl();

		User user1 = new UserImpl(mediator, "Pankaj");
		User user2 = new UserImpl(mediator, "Lisa");
		User user3 = new UserImpl(mediator, "Saurabh");
		User user4 = new UserImpl(mediator, "David");

		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);

		user1.send("Hi All");
	}
}

/*Output:
Pankaj: Sending Message:Hi All
Lisa: Received Message:Hi All
Saurabh: Received Message:Hi All
David: Received Message:Hi All
 */