package com.snow.service.home.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Value("${server.port}")
    String port;

    @RequestMapping("/home")
    public String home(@RequestParam String name) {
        logger.info("Entering into home() method, the name is: {}", name);

        return "hi " + name + ", this is service-home, i am from port:" + port;
    }

    @RequestMapping("/list")
    public Map<String, Object> list(@RequestParam String name) {
        logger.info("Entering into home() method, the name is: {}", name);
        Map<String, Object> test = new HashMap<>();
        test.put("result", "success");
        List<String> data = new ArrayList<>();
        data.add("1");
        data.add("2");
        test.put("data", data);
        test.put("port", port);
        return test;
    }

}
