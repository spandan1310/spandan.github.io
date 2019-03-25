package com.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	@Autowired @Qualifier("student1")
	private Student student1;
	
	@Autowired @Qualifier("student2")
	private Student student2;

	public Profile() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside profile constructor");
	}
	public void showAge1()
	{
		System.out.println(student1.getAge());
	}
	public void showName1()
	{
		System.out.println(student1.getName());
	}
	public void showAge2()
	{
		System.out.println(student2.getAge());
	}
	public void showName2()
	{
		System.out.println(student2.getName());
	}
}
