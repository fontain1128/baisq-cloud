package com.baisq.cloud.consul.controller.ConsulController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulController {

    @GetMapping(value = "/hi")
    public String home(){
        return "hi ,i'm miya";
    }
}
