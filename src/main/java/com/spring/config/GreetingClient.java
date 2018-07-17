package com.spring.config;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by vapa1115 on 7/17/2018.
 */
@FeignClient("SPRING-CLOUD-EUREKA-CLIENT")
public interface GreetingClient {
  @RequestMapping("/greeting")
  String greeting();
}