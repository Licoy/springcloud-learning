package cn.licoy.springcloud.servicefeign.histrix;

import cn.licoy.springcloud.servicefeign.service.SchedualHomeService;
import org.springframework.stereotype.Component;

/**
 * @author licoy.cn
 * @version 2018/2/25
 */
@Component
public class SchedualHomeServiceHystrix implements SchedualHomeService {
    @Override
    public String home(String name) {
        return "error request! "+name;
    }
}
