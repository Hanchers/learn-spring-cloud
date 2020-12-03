package com.hancher.learn.maindemo.confg;

import com.hancher.learn.maindemo.model.exception.HancherException;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * openFeign config class
 *
 * <p/>
 * @author Hancher
 * @date Created in 2020年12月02日 18:13
 * @version 1.0
 * @since 1.0
 */
@Configuration
public class OpenFeignConfig {

    public static class MyErrorDecoder implements ErrorDecoder {

        @Override
        public Exception decode(String s, Response response) {
            System.out.println(response);
            return new HancherException(s+ response.reason());
        }
    }

//    @Bean
//    public MyErrorDecoder myErrorDecoder() {
//        return new MyErrorDecoder();
//    }
}
