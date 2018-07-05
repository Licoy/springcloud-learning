package cn.licoy.scl.productservice.service;


import cn.licoy.scl.productservice.common.DecreaseStockInput;
import cn.licoy.scl.productservice.common.ProductInfoOutput;
import cn.licoy.scl.productservice.entity.ProductInfo;

import java.util.List;

/**
 * @author licoy.cn
 * @version 2018/7/5
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
