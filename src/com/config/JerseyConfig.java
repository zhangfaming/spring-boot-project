package com.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        //构造函数，在这里注册需要使用的内容，（过滤器，拦截器，API等）
        //注册类的方式
        //register(Demo.class);

        //注册包的方式
        packages("com.web");
    }
}
