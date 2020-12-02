package com.hancher.learn.maindemo.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring sleuth test
 *
 * <p/>
 * @author Hancher
 * @date Created in 2020年12月02日 14:41
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping("/sleuth")
@Slf4j
@AllArgsConstructor
public class SleuthController {
    @Autowired
    private ThreadPoolTaskExecutor taskExecutor;

    @RequestMapping("/async")
    public String asyncRequest() {
        String logPre = "http sleuth async request ";
        log.info(logPre+"start");
        taskExecutor.submit(() -> log.info(logPre + "async1"));
        taskExecutor.submit(() -> log.info(logPre + "async2"));
        log.info(logPre+"end");

        return "success";
    }
}
