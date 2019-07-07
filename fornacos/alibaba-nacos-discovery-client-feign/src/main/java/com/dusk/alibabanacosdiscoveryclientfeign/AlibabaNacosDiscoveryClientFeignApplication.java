package com.dusk.alibabanacosdiscoveryclientfeign;

import com.dusk.alibabanacosdiscoveryclientfeign.feign.ServerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class AlibabaNacosDiscoveryClientFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosDiscoveryClientFeignApplication.class, args);
    }

    @RestController
    class TestController {

        @Autowired
        ServerClient serverClient;

        @GetMapping("/test")
        public String test() {
            String result = serverClient.hello("didi");
            return "Return: " + result;
        }
    }
}
