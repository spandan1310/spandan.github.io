package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("hello.xml");
		JavaCollection jc = (JavaCollection) c.getBean("collectionbean");
		System.out.println(jc.getAddress_list());
		System.out.println(jc.getAddress_map());
		System.out.println(jc.getAddress_prop());
		System.out.println(jc.getAddress_set());
	}

}
