package cn.licoy.springcloud.servicefeign.service;

import cn.licoy.springcloud.servicefeign.histrix.SchedualHomeServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author licoy.cn
 * @version 2018/2/25
 */
@FeignClient(value = "service-hello-home",fallback = SchedualHomeServiceHystrix.class)
@Service
public interface SchedualHomeService {

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    String home(@RequestParam(value = "name") String name);

}
