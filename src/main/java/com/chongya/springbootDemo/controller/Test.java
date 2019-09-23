package com.chongya.springbootDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fangshiping
 * @date 2019/9/22 15:30
 */
@RestController
public class Test {
    @GetMapping(value = "test")
    public String Test(){
        return "Test_Jenkins";
    }

    @GetMapping(value = "hello")
    public String Hello(){
        return "hello world2222";
    }
}
