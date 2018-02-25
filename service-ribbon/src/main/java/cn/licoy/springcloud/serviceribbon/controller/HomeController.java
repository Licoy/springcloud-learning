package cn.licoy.springcloud.serviceribbon.controller;

import cn.licoy.springcloud.serviceribbon.service.HomeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * @author licoy.cn
 * @version 2018/2/25
 */
@RestController
public class HomeController {

    @Resource
    private HomeService homeService;

    @RequestMapping(value = "home")
    @HystrixCommand(fallbackMethod = "hystrix_error")
    public String home(@RequestParam String name){
        return homeService.home(name);
    }

    public String hystrix_error(String name){
        return "error request! "+ name;
    }
}
