package com.eureka.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
public class OrderController {

  @Autowired
  AlertClient alertClient;
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String read() {
    return "reading from order and return value="+alertClient.hello(); 
  }
  
  @FeignClient("ALERTSERVICE")
  interface AlertClient {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String hello();
    
    @RequestMapping(value = "/abc", method = RequestMethod.GET)
    String helloa();
  }
}
