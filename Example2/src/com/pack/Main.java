package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new FileSystemXmlApplicationContext("hello.xml");
		Student s = (Student)c.getBean("studentbean");
		s.display();
	}

}
