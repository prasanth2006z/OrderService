package com.eureka.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.eureka.order.alert.AlertServiceClient;
import com.eureka.order.service.OrderService;

public class OrderServiceImpl implements OrderService{

  @Autowired
  private  AlertServiceClient alertServiceClient;

  public String getAlertServiceHostAndAddress() {
    return "reading from order Service and return value=" + alertServiceClient.getHostAndAddress();
  }
  
  
}
