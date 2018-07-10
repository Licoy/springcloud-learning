package cn.licoy.scl.eurekaclientbook.message;

import cn.licoy.scl.eurekaclientbook.bean.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @author licoy.cn
 * @version 2018/7/10
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {

    /*@StreamListener(StreamClient.OUTPUT)
    public void process(Book msg){
        log.info("StreamReceiver OUTPUT Message: {}",msg);
    }*/

    @StreamListener(StreamClient.SMS)
    public void sms(String msg){
        log.info("SMS - Service - Message: {}",msg);
    }
}
