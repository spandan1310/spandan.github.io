package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("hello.xml");
		HelloWorld h1 = (HelloWorld) c.getBean("hello");
		System.out.println(h1.getMessage1());
		System.out.println(h1.getMessage2());
		HelloIndia h2 = (HelloIndia) c.getBean("hello1");
		System.out.println(h2.getMessage1());
		System.out.println(h2.getMessage2());
		System.out.println(h2.getMessage3());
	}

}
