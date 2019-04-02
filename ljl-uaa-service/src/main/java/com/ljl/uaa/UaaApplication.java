package com.ljl.uaa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@Slf4j
@SpringBootApplication
@EnableResourceServer
@EnableEurekaClient
public class UaaApplication {
  public static void main(String[] args) {
    log.info("开始启动");
    SpringApplication.run(UaaApplication.class, args);
    log.info("启动完成");
  }
}
