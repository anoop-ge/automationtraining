package com.p14;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ChatMessagesTreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> tm = new TreeMap<>((a, b) -> b.compareTo(a));

		tm.put("P2", "Message2");

		tm.put("P4", "Message4");

		tm.put("P1", "Message1");

		display(tm);

	}

	public static void display(TreeMap<String, String> tm) {

		Set<Entry<String, String>> sess = tm.entrySet();
		for (Entry<String, String> ess : sess) {

			System.out.println(ess.getKey() + "->" + ess.getValue());

		}

	}

}
