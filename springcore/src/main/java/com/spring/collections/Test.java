package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class Test {

	public static void main(String[] args) {
		System.out.println("hello");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collections/collectionconfig.xml");
		Emp emp1 = (Emp) context.getBean("emp1");
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getPhones());
	}

}
