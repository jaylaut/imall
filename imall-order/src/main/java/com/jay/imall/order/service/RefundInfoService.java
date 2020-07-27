package com.jay.imall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jay.imall.common.utils.PageUtils;
import com.jay.imall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author LauJay
 * @email cool_manson@163.com
 * @date 2020-07-27 15:06:17
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

