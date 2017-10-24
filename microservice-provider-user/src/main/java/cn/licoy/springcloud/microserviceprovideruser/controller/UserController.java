package cn.licoy.springcloud.microserviceprovideruser.controller;

import cn.licoy.springcloud.microserviceprovideruser.entity.User;
import cn.licoy.springcloud.microserviceprovideruser.repository.UserRepository;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Licoy.cn
 * @version 1.0 /
 */
@RestController
public class UserController {

    @Resource
    private UserRepository userRepository;
    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/get/{id}")
    public User findById(@PathVariable Long id){
        return userRepository.findOne(id);
    }

    @RequestMapping(value = "/instance/info",produces="application/json")
    public ServiceInstance showInfo() {
        return this.discoveryClient.getLocalServiceInstance();
    }

}
