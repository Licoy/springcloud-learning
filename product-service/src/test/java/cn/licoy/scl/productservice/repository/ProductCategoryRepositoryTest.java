package cn.licoy.scl.productservice.repository;

import cn.licoy.scl.productservice.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author licoy.cn
 * @version 2018/7/5
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> byCategoryTypeIn = repository.findByCategoryTypeIn(new ArrayList<Integer>() {{
            add(11);
            add(22);
        }});
        Assert.assertTrue(byCategoryTypeIn.size()>0);
    }
}