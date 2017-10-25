package cn.licoy.springcloud.microserviceconsumerribbon.controller;

import cn.licoy.springcloud.microserviceconsumerribbon.bean.User;
import cn.licoy.springcloud.microserviceconsumerribbon.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author licoy.cn
 * @version 2017/10/25
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/get/{id}")
    public User findById(@PathVariable Long id){
        return userService.findById(id);
    }

}
