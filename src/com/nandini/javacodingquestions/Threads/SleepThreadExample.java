package com.nandini.javacodingquestions.Threads;

class ChildThread extends Thread {
	public void run() {
		System.out.println("Child thread started");
		for (int i = 0; i <= 5; i++) {
			System.out.println("Child thread sleep for 5 sec and pausing current thread again start");

			try {
				Thread.sleep(5000); // pauses current thread for 5 seconds

			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

			System.out.println(i);
		}
	}
}

public class SleepThreadExample {
	public static void main(String[] args) {
		ChildThread t = new ChildThread();
		t.start(); // starts a new thread, which runs the run() method

	}

}
