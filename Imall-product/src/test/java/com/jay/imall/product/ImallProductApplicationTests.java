package com.jay.imall.product;

import com.jay.imall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ImallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
    }

}
