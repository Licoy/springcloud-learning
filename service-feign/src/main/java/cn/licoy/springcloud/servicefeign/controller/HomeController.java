package cn.licoy.springcloud.servicefeign.controller;

import cn.licoy.springcloud.servicefeign.service.SchedualHomeService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private SchedualHomeService schedualHomeService;

    @RequestMapping(value = "/home")
    public String home(@RequestParam String name){
        return schedualHomeService.home(name);
    }

}
