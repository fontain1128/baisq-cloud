package com.baisq.cloud.demo.feign.controller;

import com.baisq.cloud.demo.feign.service.HiFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiFeignController {

    @Autowired
    private HiFeignService hiFeignService;

    @RequestMapping(value = "/hi")
    public String hiFeign(@RequestParam(name = "name") String name){
        return hiFeignService.hiFeignService(name);
    }
}
