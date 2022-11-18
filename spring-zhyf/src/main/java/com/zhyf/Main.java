package com.zhyf;

import org.springframework.context.ApplicationContext;
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
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-test.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}
}
