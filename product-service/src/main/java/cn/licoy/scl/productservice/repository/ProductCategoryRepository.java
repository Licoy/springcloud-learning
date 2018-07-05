package cn.licoy.scl.productservice.repository;

import cn.licoy.scl.productservice.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author licoy.cn
 * @version 2018/7/5
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {


    List<ProductCategory> findByCategoryTypeIn(List<Integer> ins);

}
