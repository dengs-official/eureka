package com.snow.service.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomeService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "homeError")
    public String homeService(String name) {
        return restTemplate.getForObject("http://service-home/home?name=" + name, String.class);
    }

    public String homeError(String name) {
        return "hi, " + name + ", sorry, error!";
    }
}
