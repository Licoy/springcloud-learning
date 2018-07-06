package cn.licoy.scl.eurekaclientbook.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author licoy.cn
 * @version 2018/7/6
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    private String name;

    private String author;

    private String port;

}
