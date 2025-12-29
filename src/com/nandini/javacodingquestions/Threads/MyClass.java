package com.nandini.javacodingquestions.Threads;

class FirstThread extends Thread {

	public void run() {
		System.out.println("Thread Running");
	}

}

public class MyClass {
	public static void main(String[] args) {

		FirstThread t1 = new FirstThread();
		t1.start();

	}
}
