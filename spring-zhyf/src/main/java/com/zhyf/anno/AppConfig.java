package com.zhyf.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Copyright (c) 2022. All Rights Reserved
 *
 * @Author Zhang Youfa
 * @Date 2023/09/05 1:27 PM
 * @Description TODO
 */
@Configuration
@ComponentScan("com.zhyf.anno")
@PropertySource("classpath:app.properties")
public class AppConfig {

}
