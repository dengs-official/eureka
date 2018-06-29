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
package com.snow.service.feign.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/***************************************************************************
 * <PRE>
 *  Project Name    : eureka
 *
 *  Package Name    : com.snow.remote.feign.remote
 *
 *  File Name       : HomeRemoteService.java
 *
 *  Creation Date   : 6/26/18
 *
 *  Author          : snowdeng
 *
 *  Purpose         : it used to defined the home feign client
 *
 *
 *  History         : 2018-06-26, snowdeng, add this class.
 *
 * </PRE>
 ***************************************************************************/
@FeignClient(value = "service-home", fallback = HomeRemoteServiceHystric.class)
public interface HomeRemoteService {

    @RequestMapping(value = "/home")
    String home(@RequestParam("name") String name);

}
