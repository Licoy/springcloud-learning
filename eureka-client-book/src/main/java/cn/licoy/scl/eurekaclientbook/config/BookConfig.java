package cn.licoy.scl.eurekaclientbook.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * @author licoy.cn
 * @version 2018/7/9
 */
@Data
@ConfigurationProperties(prefix = "book")
@Component
@RefreshScope
public class BookConfig implements Serializable {

    private Integer max;

    private Integer min;

    private String author;

    private List<String> bookList;
}
