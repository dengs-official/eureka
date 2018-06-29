package com.snow.service.ribbon.controller;

import com.snow.service.ribbon.remote.ServerRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @Autowired
    private ServerRemoteService serverRemoteService;

    @RequestMapping(value = "/server")
    public String server() {
        return serverRemoteService.serverService();
    }
}
