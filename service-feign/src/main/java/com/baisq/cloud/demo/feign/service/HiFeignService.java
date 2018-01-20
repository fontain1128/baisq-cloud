package com.baisq.cloud.demo.feign.service;

import com.baisq.cloud.demo.feign.error.HIFeignServiceHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = HIFeignServiceHystric.class)
public interface HiFeignService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hiFeignService(@RequestParam(value = "name") String name);
}
