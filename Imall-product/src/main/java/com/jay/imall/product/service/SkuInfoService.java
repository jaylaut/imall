package com.jay.imall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jay.imall.common.utils.PageUtils;
import com.jay.imall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author LauJay
 * @email cool_manson@163.com
 * @date 2020-07-27 10:02:24
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

