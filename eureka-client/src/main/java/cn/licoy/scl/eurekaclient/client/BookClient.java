package cn.licoy.scl.eurekaclient.client;

import cn.licoy.scl.eurekaclient.bean.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author licoy.cn
 * @version 2018/7/6
 */
@FeignClient(name = "eureka-client-book")
@Component
public interface BookClient {

    @GetMapping("/book/list")
    List<Book> books();
}
