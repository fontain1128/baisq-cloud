package com.baisq.cloud.demo.feign.error;

import com.baisq.cloud.demo.feign.service.HiFeignService;
import org.springframework.stereotype.Component;

@Component
public class HIFeignServiceHystric implements HiFeignService {
    @Override public String hiFeignService(String name) {
        return "error"+name;
    }
}
