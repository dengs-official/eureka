package com.snow.service.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomeService {

    Logger logger = LoggerFactory.getLogger(HomeService.class);

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "homeError")
    public String homeService(String name) {
        logger.info("Entering homeService() method, go to call service-home/home api, the name is: {}", name);

        return restTemplate.getForObject("http://service-home/home?name=" + name, String.class);
    }

    public String homeError(String name) {
        return "hi, " + name + ", sorry, error!";
    }
}
