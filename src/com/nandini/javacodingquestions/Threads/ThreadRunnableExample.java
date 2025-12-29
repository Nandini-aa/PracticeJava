package com.nandini.javacodingquestions.Threads;

class AnotherThread implements Runnable {
	public void run() {
		System.out.println(" Runnable Thread Running");

	}
}

public class ThreadRunnableExample {
	public static void main(String[] args) {

		Thread t1 = new Thread(new AnotherThread());
		t1.start();

	};
}
