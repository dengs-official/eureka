package com.snow.service.home.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Value("${server.port}")
    String port;

    @RequestMapping("/home")
    public String home(@RequestParam String name) {
        logger.info("Entering into home() method, the name is: {}", name);

        return "hi " + name + ", this is service-home, i am from port:" + port;
    }
}
