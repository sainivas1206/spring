package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Welcome;

public class TestBeanLifeCycle {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("LifeCycleConfig.xml");
		
		Welcome wl = (Welcome) ac.getBean("welcome");
		
		System.out.println(wl.displayMessage());
	}

}
