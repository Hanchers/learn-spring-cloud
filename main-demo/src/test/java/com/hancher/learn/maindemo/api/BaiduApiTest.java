package com.hancher.learn.maindemo.api;

import com.hancher.learn.maindemo.BaseTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
class BaiduApiTest extends BaseTests {
    @Autowired
    private BaiduApi baiduApi;

    @Test
    void getBaiduHome() {
        String homePage = baiduApi.getBaiduHome();
        log.info("baidu home : {}",homePage);
        Assertions.assertNotNull(homePage);
        Assertions.assertFalse(homePage.isEmpty());
    }
}