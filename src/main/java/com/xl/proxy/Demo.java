package com.xl.proxy;

public class Demo {

	public static void main(String[] args) {

//		RealSubject realSubject = new RealSubject();
//		InvocationHandler handler = new DynamicProxyDemo(realSubject);
//		Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
//				realSubject.getClass().getInterfaces(), handler);

//		subject.rent();
		
		RealSubject realSubject = (RealSubject) new DynamicProxyDemo().createProxyInstance(new RealSubject());
		realSubject.rent();
	}

}
