package com.snow.service.feign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HystrixServletDefinitions {

    @Bean(name = "hystrixRegistrationBean")
    @SuppressWarnings("unchecked")
    public ServletRegistrationBean servletRegistrationBean() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registration = new ServletRegistrationBean(streamServlet);
        registration.addUrlMappings("/hystrix.stream");
        registration.setName("hystrixServlet");
        registration.setLoadOnStartup(1);
        return registration;
    }
}
