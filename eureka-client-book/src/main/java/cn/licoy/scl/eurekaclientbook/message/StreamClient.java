package cn.licoy.scl.eurekaclientbook.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author licoy.cn
 * @version 2018/7/10
 */
public interface StreamClient {

    String INPUT = "myMessageINPUT";
    String OUTPUT = "myMessageOUTPUT";
    String SMS = "myMessageSMS";

    @Input(INPUT)
    SubscribableChannel input();

    @Output(OUTPUT)
    MessageChannel output();

    @Output(SMS)
    MessageChannel sms();

}
