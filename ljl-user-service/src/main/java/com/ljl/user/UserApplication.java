package com.ljl.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@Slf4j
@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
public class UserApplication {
  public static void main(String[] args) {
    log.info("开始启动");
    SpringApplication.run(UserApplication.class, args);
    log.info("启动完成");
  }
}
