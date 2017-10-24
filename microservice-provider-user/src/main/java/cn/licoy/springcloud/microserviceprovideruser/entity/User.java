package cn.licoy.springcloud.microserviceprovideruser.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Licoy.cn
 * @version 1.0 /
 */
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private Integer age;
}
