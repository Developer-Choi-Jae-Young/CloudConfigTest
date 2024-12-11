package org.example.cloudconfigtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigTestApplication.class, args);
    }

}
