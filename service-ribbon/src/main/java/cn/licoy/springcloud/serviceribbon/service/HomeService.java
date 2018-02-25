package cn.licoy.springcloud.serviceribbon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author licoy.cn
 * @version 2018/2/25
 */
@Service
public class HomeService {

    @Resource
    private RestTemplate restTemplate;

    public String home(String name){
        return restTemplate.getForObject("http://service-hello-home/home?name="+name,String.class);
    }

}
