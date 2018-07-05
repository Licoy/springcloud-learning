package cn.licoy.scl.productservice.service;


import cn.licoy.scl.productservice.entity.ProductCategory;

import java.util.List;

/**
 * @author licoy.cn
 * @version 2018/7/5
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
