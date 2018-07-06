package cn.licoy.scl.eurekaclient.controller;

import cn.licoy.scl.eurekaclient.bean.Book;
import cn.licoy.scl.eurekaclient.client.BookClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author licoy.cn
 * @version 2018/7/6
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private BookClient bookClient;

    @GetMapping("/list")
    //使用restTemplate调用固定url
    public List<Book> list() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange("http://localhost:8772/book/list",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<Book>>() {
                }).getBody();
    }

    @GetMapping("/list2")
    //使用loadBalancerClient获取服务的url，然后再通过restTemplate调用
    public List<Book> list2(){
        ServiceInstance instance = loadBalancerClient.choose("eureka-client-book");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange(String.format("http://%s:%s/book/list",
                instance.getHost(),instance.getPort()),
                HttpMethod.GET, null, new ParameterizedTypeReference<List<Book>>() {
                }).getBody();
    }

    @GetMapping("/list3")
    //通过@LoadBalanced来进行直接调用服务
    public List<Book> list3(){
        return restTemplate.exchange("http://eureka-client-book/book/list",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<Book>>() {
                }).getBody();
    }

    @GetMapping("/list4")
    //通过Feign来获取数据
    public List<Book> list4(){
        return bookClient.books();
    }

}
