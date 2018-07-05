package cn.licoy.scl.productservice.service.impl;

import cn.licoy.scl.productservice.entity.ProductCategory;
import cn.licoy.scl.productservice.repository.ProductCategoryRepository;
import cn.licoy.scl.productservice.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author licoy.cn
 * @version 2018/7/5
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
