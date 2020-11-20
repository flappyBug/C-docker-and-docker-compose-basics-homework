package com.thoughtworks.capability.gtb.alice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/hello")
    String hello() {
        return restTemplate.getForObject("http://bob:8081/hello", String.class);
    }
}
