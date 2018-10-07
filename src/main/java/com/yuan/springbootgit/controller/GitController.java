package com.yuan.springbootgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试git的使用
 */
@RestController
@RequestMapping("git")
public class GitController {
    @GetMapping("hello")
    public String hello()throws Exception{
        System.out.println("使用idea测试git的使用");
        return "this my first git project ";
    }
}
