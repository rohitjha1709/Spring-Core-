package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		
			//registring shutdown hook
			context.registerShutdownHook();
			
			Pen pen = (Pen)context.getBean("p");
			System.out.println(pen);
			
			Pencil pencil = (Pencil)context.getBean("pencil");
			System.out.println(pencil);
			
			Example ex = (Example)context.getBean("ex");
			System.out.println(ex);

	}

}
