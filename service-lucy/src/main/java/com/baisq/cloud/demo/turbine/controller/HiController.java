package com.baisq.cloud.demo.turbine.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "/hi")
    @HystrixCommand(fallbackMethod = "errorMethod")
    public String honme(@RequestParam String name){
        return "hi "+name+",i am from port:" +port;
    }

    private String errorMethod(String name){
        return "hi,"+name+",sorry,error!";
    }
}
