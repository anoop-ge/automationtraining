package com.p14;

import java.util.*;

class ChatMessagesn {

	private String sname;
	private String message;

	public ChatMessagesn(String name,String message) {
		this.sname = name;
		this.message=message;
	}

	@Override
	public String toString() {
		return "ChatMessages [sname=" + sname + ", message=" + message + "]";
	}

}

public class ChatMessageslink {

public static void main(String[] args) {
	
	
	List<ChatMessagesn> msgs= new LinkedList<>();
	
	
	//Add chat messages

ChatMessagesn cm =new ChatMessagesn("p1","S");
ChatMessagesn cm1 =new ChatMessagesn("P2","T");
ChatMessagesn cm2 =new ChatMessagesn("P3","D");


msgs.add(cm);
msgs.add(cm1);
msgs.add(cm2);
display(msgs);
System.out.println("After reversing");


Collections.reverse(msgs);
display(msgs);

}

//iterate and display

	static void display(List<ChatMessagesn> msgs) {

		for (ChatMessagesn cm : msgs) {

			System.out.println(cm);

		}
	}


}


//Use Treeset for above application store chat objects and sort based on ascending order of participant list.