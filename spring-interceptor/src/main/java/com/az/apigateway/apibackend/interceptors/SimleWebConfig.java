package com.az.apigateway.apibackend.interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SimleWebConfig implements WebMvcConfigurer {

    @Autowired
    SimpleInterceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // Interceptor only injected for provided path
        registry.addInterceptor(interceptor).addPathPatterns("/headers");
    }
}
