package com.yuan.springbootgit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目经理的账号
 */
@SpringBootApplication
/**
 * 组员的账号
 */
public class SpringbootgitApplication {

    public static void main(String[] args) {
        System.out.println("springboot程序的入口");
        SpringApplication.run(SpringbootgitApplication.class, args);
    }
}
