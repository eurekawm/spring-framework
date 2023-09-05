package com.zhyf;

import com.zhyf.anno.AppConfig;
import com.zhyf.anno.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright (c) 2022. All Rights Reserved
 *
 * @Author Zhang Youfa
 * @Date 2023/09/05 1:32 PM
 * @Description TODO
 */
public class TestAppConfig {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Product product = (Product) applicationContext.getBean("product");
		System.out.println(product);
	}
}
