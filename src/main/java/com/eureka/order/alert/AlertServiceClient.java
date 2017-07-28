package com.eureka.order.alert;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Prasanth.P
 *
 */
@FeignClient("ALERTSERVICE")
public interface AlertServiceClient {
  @RequestMapping(value = "/", method = RequestMethod.GET)
  String getHostAndAddress();
}
