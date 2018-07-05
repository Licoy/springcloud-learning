package cn.licoy.scl.productservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 商品上下架状态
 * 2017-12-09 22:00
 */
@Getter
@AllArgsConstructor
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架"),
    ;

    private Integer code;

    private String message;
}
