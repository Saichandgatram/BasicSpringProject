package com.laptop.pc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Laptop_A {

	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		HDD hd_obj = (HDD)context.getBean("hdobj");
		hd_obj.store_data();
		hd_obj.retrieve_data();
	}
}
