package com.jay.imall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jay.imall.common.utils.PageUtils;
import com.jay.imall.coupon.entity.PmsSpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author LauJay
 * @email cool_manson@163.com
 * @date 2020-07-27 11:10:33
 */
public interface PmsSpuImagesService extends IService<PmsSpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

