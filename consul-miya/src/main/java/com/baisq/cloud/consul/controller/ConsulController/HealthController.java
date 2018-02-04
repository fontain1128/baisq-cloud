package com.baisq.cloud.consul.controller.ConsulController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    //健康检查的实现REST部分
    @RequestMapping("/health")
    public String health() {
        return "hello health ";
    }
}
