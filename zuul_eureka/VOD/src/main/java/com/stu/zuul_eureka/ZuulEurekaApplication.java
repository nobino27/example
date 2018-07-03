package com.stu.zuul_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
@EnableDiscoveryClient
@RequestMapping("/")
public class ZuulEurekaApplication {
    @GetMapping
    public String listVod() {return "Vod 1";}
    public static void main(String[] args) {
        SpringApplication.run(ZuulEurekaApplication.class, args);
    }
}
