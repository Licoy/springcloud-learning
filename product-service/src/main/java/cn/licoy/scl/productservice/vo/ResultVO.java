package cn.licoy.scl.productservice.vo;

import lombok.Data;

/**
 * @author licoy.cn
 * @version 2018/7/5
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
