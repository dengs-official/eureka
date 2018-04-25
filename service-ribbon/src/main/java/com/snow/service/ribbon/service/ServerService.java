package com.snow.service.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServerService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${spring.application.name}")
    String name;

    @HystrixCommand(fallbackMethod = "serverError")
    public String serverService() {
        return restTemplate.getForObject("http://eureka-server/server?application=" + name, String.class);
    }

    public String serverError() {
        return "get " + name + " register server error!";
    }
}
