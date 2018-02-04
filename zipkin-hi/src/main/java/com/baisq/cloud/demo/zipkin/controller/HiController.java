package com.baisq.cloud.demo.zipkin.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HiController {

    private static final Logger log = Logger.getLogger(HiController.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/hi")
    public String hi(){
        log.log(Level.INFO,"calling trace zipkin-hi");
        return restTemplate.getForObject("http://localhost:8989/miya", String.class);
    }

    @RequestMapping("/info")
    public String info(){
        log.log(Level.INFO, "calling trace zipkin-hi");
        return "i'm zipkin-hi";
    }
}
