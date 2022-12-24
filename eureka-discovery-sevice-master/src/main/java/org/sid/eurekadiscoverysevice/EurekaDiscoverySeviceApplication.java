package org.sid.eurekadiscoverysevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoverySeviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaDiscoverySeviceApplication.class, args);
    }

}
