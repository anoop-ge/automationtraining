package com.threading;

class PrintCharacter extends Thread {

	
	String string1="Thread Exaple";
	@Override
	public void run() {
		try {
			
			for (int i = 0; i < string1.length(); i++) {
				System.out.println(string1.charAt(i));
				Thread.sleep(25);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class MultithreadingEg {

	public static String s = "I am developing a multithreaded program";

	public static void main(String[] args) {

		try {
			PrintCharacter printc = new PrintCharacter();

			printc.start();

			for (int i = 0; i < s.length(); i++) {
				System.out.println(s.charAt(i));
				Thread.sleep(30);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
