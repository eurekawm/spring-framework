package com.zhyf;

import org.springframework.ui.context.ThemeSource;

/**
 * Copyright (c) 2022. All Rights Reserved
 *
 * @Author Zhang Youfa
 * @Date 2022/11/18 11:16 PM
 * @Description TODO
 */
public class Student {

	private int age;
	private String name;
	private Dog dog;

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"age=" + age +
				", dog=" + dog +
				", name='" + name + '\'' +
				'}';
	}
}
