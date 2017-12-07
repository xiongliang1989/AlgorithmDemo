package com.xl.thread;

public class ThreadTest {

	public static void main(String[] args) {
		MyThread my = new MyThread();
		new Thread(my).start();
		new Thread(my).start();
		new Thread(my).start();
	}

}
