package com.eureka.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.order.service.OrderService;

/**
 * 
 * @author Prasanth.P
 *
 */
@RestController
public class OrderController {

  @Autowired
  private OrderService orderService;
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String read() {
    return orderService.getAlertServiceHostAndAddress();
  }

}
