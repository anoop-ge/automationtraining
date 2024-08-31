package com.p14;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class ChatMessagestl {

	private String sname;
	private String message;

	public ChatMessagestl(String name, String message) {
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

public class ChatMessageTreesetlamda {

	public static void main(String[] args) {
		TreeSet<ChatMessagestl> ts = new TreeSet<>((o1, o2) -> o1.getSname().compareTo(o2.getSname()));
		
		
		//Comparator<ChatMessagesl>=new Comparator<ChatMessagesl>{

		ts.add(new ChatMessagestl("P1", "Message1"));
		ts.add(new ChatMessagestl("P3", "Message3"));
		ts.add(new ChatMessagestl("P4", "Message4"));
		ts.add(new ChatMessagestl("P5", "Message5"));
		display(ts);
		ChatMessagestl cm = Collections.min(ts, (o1, o2) -> o1.getMessage().compareTo(o2.getMessage()));
		
		System.out.println("========Minimum Value================");
	

		System.out.println("Minimum value:" + cm);
		

		System.out.println("Filtered Values Based on P1 and P2");
		
		System.out.println("===================================");

		ts.stream().filter((e) -> {
			return e.getSname().equalsIgnoreCase("P1") || e.getSname().equalsIgnoreCase("P3");
		}).forEach((item) -> {
			System.out.println(item);
		});

	}

	   public static void display(TreeSet<ChatMessagestl> ts) {

		for (ChatMessagestl cm : ts) {

			System.out.println(cm);
		}

	

}


}