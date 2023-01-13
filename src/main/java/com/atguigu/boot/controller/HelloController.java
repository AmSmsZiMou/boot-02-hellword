package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2022--12--2022/12/16--15:50
 */
@RestController
public class HelloController {
   @Autowired
    Person person;


    @RequestMapping("/person")
    public Person person(){
        return person;
    }
}
