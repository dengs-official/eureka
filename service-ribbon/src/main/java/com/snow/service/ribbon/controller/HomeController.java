package com.snow.service.ribbon.controller;

import com.snow.service.ribbon.remote.HomeRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    HomeRemoteService homeRemoteService;

    @RequestMapping(value = "/home")
    public String home(@RequestParam String name) {
        return homeRemoteService.homeService(name);
    }
}
