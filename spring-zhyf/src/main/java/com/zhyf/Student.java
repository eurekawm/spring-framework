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
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				'}';
	}
}
