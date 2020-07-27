package com.jay.imall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jay.imall.common.utils.PageUtils;
import com.jay.imall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author LauJay
 * @email cool_manson@163.com
 * @date 2020-07-27 15:02:39
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

