package com.p14;

import java.util.TreeSet;

import java.util.Comparator;


class ChatMessagest {

	private String sname;
	private String message;

	public ChatMessagest(String name, String message) {
		this.sname = name;
		this.message = message;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ChatMessages [Participant name=" + sname + ", message=" + message + "]";
	}

}

public class ChatMessagesTree {

	public static void main(String[] args) {
		TreeSet<ChatMessagest> ts = new TreeSet<ChatMessagest>(new MessageComparator());

		ts.add(new ChatMessagest("P1", "Message1"));
		ts.add(new ChatMessagest("P3", "Message3"));
		ts.add(new ChatMessagest("P4", "Message4"));
		ts.add(new ChatMessagest("P5", "Message5"));
		display(ts);

	}

	static void display(TreeSet<ChatMessagest> ts) {

		for (ChatMessagest cm : ts) {

			System.out.println(cm);
		}

	}

}

class MessageComparator implements Comparator<ChatMessagest> {

	@Override
	public int compare(ChatMessagest o1, ChatMessagest o2) {
		// TODO Auto-generated method stub

		return o1.getSname().compareTo(o2.getSname());

	}

}
