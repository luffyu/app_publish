package com.luffyu.app.publish.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luffyu
 * Created on 2021/8/20
 */
@RestController
@RequestMapping("/app")
public class AppController {


    @GetMapping("/info")
    public String getInfo(String appName){
        return "app info get " + appName;
    }

}
