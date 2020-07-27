package com.jay.imall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jay.imall.common.utils.PageUtils;
import com.jay.imall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author LauJay
 * @email cool_manson@163.com
 * @date 2020-07-27 15:09:33
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

