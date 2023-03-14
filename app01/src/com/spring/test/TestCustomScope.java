package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Welcome;

public class TestCustomScope {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Welcome wl = (Welcome) ac.getBean("welcome");
		
		System.out.println(wl.displayMessage());

//		new Thread(()-> {
//			Hello hello1 = (Hello) ac.getBean("hello");
//			System.out.println("Thread 1 First call  :: " + hello1);
//			Hello hello2 = (Hello) ac.getBean("hello");
//			System.out.println("Thread 1 Second call :: " + hello2);
//		}).start();
//		
//		new Thread(()-> {
//			Hello hello3 = (Hello) ac.getBean("hello");
//			System.out.println("Thread 2 First call  :: " + hello3);
//			Hello hello4 = (Hello) ac.getBean("hello");
//			System.out.println("Thread 2 Second call :: " + hello4);
//		}).start();
//	

	}

}
