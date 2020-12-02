package com.hancher.learn.maindemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * hello world
 *
 * <p/>
 * @author Hancher
 * @date Created in 2020年12月02日 14:31
 * @version 1.0
 * @since 1.0
 */
@RestController
@Slf4j
public class HelloController {

    @RequestMapping("/")
    public String helloWorld() {
        log.info("hello hancher world");
        return "hello hancher world";
    }
}
