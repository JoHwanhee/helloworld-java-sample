package com.trevari.helloworldsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloworldSampleApplication {

    @RestController
    public static class HelloController {
        @GetMapping(value = {"/"})
        public String hello() {
            return "hello v1.0.0";
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloworldSampleApplication.class, args);
    }
}
