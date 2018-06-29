/***************************************************************************
 *
 *  COPYRIGHT (c) 2004 BY INTEGRATED CONCEPTS INTERNATIONAL LIMITED.
 *
 *  ALL RIGHTS RESERVED. NO PART OF THIS TEXT FILE MAY BE REPRODUCED,
 *  STORED IN A RETRIEVAL SYSTEM OR COMPUTER SYSTEM, OR TRANSMITTED
 *  IN ANY FORM OR BY ANY MEANS, ELECTRONIC, MECHANICAL, PHOTOCOPYING,
 *  RECORDING OR OTHERWISE, WITHOUT PRIOR WRITTEN PERMISSION OF
 *  INTEGRATED CONCEPTS INTERNATIONAL LIMITED.
 *
 *  Integrated Concepts International Limited
 *  11th Broadway
 *  64-52 Lockhart Road
 *  Wanchai, Hong Kong
 *  Telephone       (852) 27788682
 *  Facsimile       (852) 27764515
 *
 ***************************************************************************/
package com.snow.service.feign.controller;

import com.snow.service.feign.remote.HomeRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/***************************************************************************
 * <PRE>
 *  Project Name    : eureka
 *
 *  Package Name    : com.snow.remote.feign.controller
 *
 *  File Name       : HomeController.java
 *
 *  Creation Date   : 6/26/18
 *
 *  Author          : snowdeng
 *
 *  Purpose         : it used to get the remote-home data
 *
 *
 *  History         : 2018-06-26, snowdeng, add this class
 *
 * </PRE>
 ***************************************************************************/
@RestController
public class HomeController {

    @Autowired
    private HomeRemoteService homeRemoteService;

    @RequestMapping(value = "/home")
    public String home(@RequestParam String name) {
        return homeRemoteService.home(name);
    }

}
