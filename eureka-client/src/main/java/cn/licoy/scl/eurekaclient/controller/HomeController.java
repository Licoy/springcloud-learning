package cn.licoy.scl.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author licoy.cn
 * @version 2018/7/6
 */
@RestController
@RequestMapping("/")
public class HomeController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping
    public String home(){
        return "eureka-client for port is : " + port;
    }

}
