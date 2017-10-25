package cn.licoy.springcloud.microserviceconsumerribbon.service;

import cn.licoy.springcloud.microserviceconsumerribbon.bean.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author licoy.cn
 * @version 2017/10/25
 */
@Service
@Log4j
public class UserService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public User findById(Long id){
        return this.restTemplate.getForObject("http://MICROSERVICE-PROVIDER-USER/get/"+id,User.class);
    }

    public User fallback(Long id){
        log.info("异常发生，进入fallback方法，接收的参数为 id = "+id);
        User user = new User();
        user.setId(-1L);
        user.setAge(0);
        user.setUsername("not login");
        return user;
    }

}
