package cn.licoy.scl.productservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 2017-12-10 23:00
 */
@Getter
@AllArgsConstructor
public enum ResultEnum {

    PRODUCT_NOT_EXIST(1, "商品不存在"),
    PRODUCT_STOCK_ERROR(2, "库存有误"),
    ;

    private Integer code;

    private String message;
}
