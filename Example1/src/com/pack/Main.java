package com.pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Resource res =  new ClassPathResource("hello.xml");
		 BeanFactory f  = new XmlBeanFactory(res); 
		 Student s = (Student) f.getBean("studentbean");
		 s.display();
	}

}
