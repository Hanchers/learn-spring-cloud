package com.hancher.learn.maindemo.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * openfeign 测试
 * baidu api
 *
 * <p/>
 * @author Hancher
 * @date Created in 2020年12月02日 17:34
 * @version 1.0
 * @since 1.0
 */
@FeignClient(url = "https://www.baidu.com/",name = "baidu" ,fallback = BaiduApi.BaiduApiFallback.class )
public interface BaiduApi {

    @RequestMapping(method = RequestMethod.GET, value = "/aaa")
    String getBaiduHome();


    public class  BaiduApiFallback implements BaiduApi {

        @Override
        public String getBaiduHome() {
            return "hello?";
        }
    }
}
