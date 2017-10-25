package cn.licoy.springcloud.microserviceconsumerribbon.bean;

import lombok.Data;

/**
 * @author licoy.cn
 * @version 2017/10/25
 */
@Data
public class User {
    private Long id;
    private String username;
    private Integer age;
}
