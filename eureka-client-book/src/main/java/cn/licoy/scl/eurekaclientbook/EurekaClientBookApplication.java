package cn.licoy.scl.eurekaclientbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientBookApplication.class, args);
    }
}
