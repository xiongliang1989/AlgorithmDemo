package com.xl.proxy;

public class RealSubject{

	public void rent() {
		System.out.println("I want to rent my house");
	}

	public void hello(String str) {
		System.out.println("hello: " + str);
	}

}
