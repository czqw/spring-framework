package com.czq.context;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhiqiang.cheng
 * @description
 * @date 2019/10/5
 */
public class PersonTest {

	@Test
	public void test01(){
		ApplicationContext context = new ClassPathXmlApplicationContext("com.czq.context/person.xml");
		Person person = (Person) context.getBean("p");
		System.out.println(person.getName());
	}
}
