package cn.licoy.scl.eurekaclientbook.controller;

import cn.licoy.scl.eurekaclientbook.bean.Book;
import cn.licoy.scl.eurekaclientbook.message.StreamClient;
import cn.licoy.scl.eurekaclientbook.message.StreamReceiver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author licoy.cn
 * @version 2018/7/10
 */
@RestController
@RequestMapping("/msg")
public class MessageController {

    @Autowired
    private StreamClient streamClient;

    /*@GetMapping("/send")
    public void send(){
        Book input = Book.builder().author("input").port("1000").build();
        streamClient.input().send(MessageBuilder.withPayload(input).build());
    }*/

    @GetMapping("/send")
    public void send(){
        Book input = Book.builder().author("output").port("1000").build();
        streamClient.output().send(MessageBuilder.withPayload(input).build());
    }

}
