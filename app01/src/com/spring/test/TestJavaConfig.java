package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.Hello;
import com.spring.beans.Welcome;
import com.spring.config.JavaConfig;

public class TestJavaConfig {
	
	public static void main(String[] args) {
		ApplicationContext ac =  new AnnotationConfigApplicationContext(JavaConfig.class);
//		Hello h =(Hello) ac.getBean("hello");
//		
//		Welcome w = (Welcome) ac.getBean("welcome");
//		
//		System.out.println(h.sayHello());
//		
//		w.setName("nivas");
//		w.setMessage("Good Eve");
//		
//		System.out.println(w.displayMessage());
		
		System.out.println(ac.getBean("hello").hashCode());

		new Thread(()-> {
			Hello hello1 = (Hello) ac.getBean("hello");
			System.out.println("Thread 1 First call  :: " + hello1);
			Hello hello2 = (Hello) ac.getBean("hello");
			System.out.println("Thread 1 Second call :: " + hello2);
		}).start();
		
		new Thread(()-> {
			Hello hello3 = (Hello) ac.getBean("hello");
			System.out.println("Thread 2 First call  :: " + hello3);
			Hello hello4 = (Hello) ac.getBean("hello");
			System.out.println("Thread 2 Second call :: " + hello4);
		}).start();
		
	}

}
