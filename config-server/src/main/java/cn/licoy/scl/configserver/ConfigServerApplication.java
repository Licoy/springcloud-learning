package cn.licoy.scl.configserver;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
@RestController
public class ConfigServerApplication {

    @Value("${server.port}")
    private String port;

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

    @PostMapping("/refresh")
    public void refresh(){
        DefaultHttpClient httpClient = new DefaultHttpClient();
        String url = "http://localhost:"+port+"/actuator/bus-refresh";
        HttpPost httpPost = new HttpPost(url);
        // 执行请求
        try {
            httpClient.execute(httpPost);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
