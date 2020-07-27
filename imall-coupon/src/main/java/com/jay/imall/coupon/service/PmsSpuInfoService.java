package com.jay.imall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jay.imall.common.utils.PageUtils;
import com.jay.imall.coupon.entity.PmsSpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author LauJay
 * @email cool_manson@163.com
 * @date 2020-07-27 11:10:33
 */
public interface PmsSpuInfoService extends IService<PmsSpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

