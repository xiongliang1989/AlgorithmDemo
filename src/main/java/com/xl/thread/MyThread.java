package com.xl.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread implements Runnable {

	private AtomicInteger ticket = new AtomicInteger(5);

	public void run() {
		for (int i = 0; i < 10; i++) {
			if (ticket.get() > 0) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("ticket = " + ticket.decrementAndGet());
			}
		}

	}

}
