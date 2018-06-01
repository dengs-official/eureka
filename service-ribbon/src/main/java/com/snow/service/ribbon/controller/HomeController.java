package com.snow.service.ribbon.controller;

import com.snow.service.ribbon.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    @RequestMapping(value = "/home")
    public String home(@RequestParam String name) {
        return homeService.homeService(name);
    }

    @RequestMapping(value = "/list")
    public Map list(@RequestParam String name) {
        return homeService.listService(name);
    }
}
