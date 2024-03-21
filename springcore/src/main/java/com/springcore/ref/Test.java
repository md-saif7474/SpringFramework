package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
        A a = (A) context.getBean("aref");
        System.out.println(a.getY());
        System.out.println(a.getOb().getX());
	}

}
