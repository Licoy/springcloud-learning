package cn.licoy.springcloud.serviceribbon.controller;

import cn.licoy.springcloud.serviceribbon.service.HomeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author licoy.cn
 * @version 2018/2/25
 */
@RestController
public class HomeController {

    @Resource
    private HomeService homeService;

    @RequestMapping(value = "home")
    public String home(@RequestParam String name){
        return homeService.home(name);
    }

}
