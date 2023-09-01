package com.zhyf;


import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Copyright (c) 2022. All Rights Reserved
 *
 * @Author Zhang Youfa
 * @Date 2022/11/18 11:17 PM
 * @Description TODO
 */
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-test.xml");
		Object student = classPathXmlApplicationContext.getBean("student");
		System.out.println(student);
	}
}
