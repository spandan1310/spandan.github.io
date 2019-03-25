package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("hello.xml");
		Profile p = (Profile) c.getBean("profile1");
		p.showAge1();
		p.showName1();
		p.showAge2();
		p.showName2();
	
	}
}
