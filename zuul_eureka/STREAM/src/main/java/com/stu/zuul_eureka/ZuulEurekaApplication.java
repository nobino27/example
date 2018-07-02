package com.stu.zuul_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication

public class ZuulEurekaApplication {
    @RequestMapping(value = "/1")
    public String listVod() {return "Stream 1";}
    @RequestMapping(value = "/2")
    public String vod() {return "Stream 2";}
    public static void main(String[] args) {
        SpringApplication.run(ZuulEurekaApplication.class, args);
    }
}
