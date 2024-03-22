package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Lifecycle/config.xml");
		Lifecycle l = (Lifecycle) context.getBean("lifecycle");
		System.out.println(l);
		context.registerShutdownHook();
	}

}
