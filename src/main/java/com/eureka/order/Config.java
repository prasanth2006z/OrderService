package com.eureka.order;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.eureka.order.service.OrderService;
import com.eureka.order.service.impl.OrderServiceImpl;

/**
 * 
 * @author Prasanth.P
 *
 */
@Configuration
@EnableFeignClients
@ComponentScan(basePackages="com.eureka.order")
public class Config {

  @LoadBalanced
  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
  
  @Bean
  public AlwaysSampler defaultSampler() {
    return new AlwaysSampler();
  }
  
  @Bean
  public OrderService orderService() {
    return new OrderServiceImpl();
  }
  
}
