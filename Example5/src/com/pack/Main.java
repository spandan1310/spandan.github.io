package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("hello.xml");
		TextEditor t = (TextEditor) c.getBean("text");
		t.test();
	}

}
