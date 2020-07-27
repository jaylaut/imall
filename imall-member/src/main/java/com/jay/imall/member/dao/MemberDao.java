package com.jay.imall.member.dao;

import com.jay.imall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author LauJay
 * @email cool_manson@163.com
 * @date 2020-07-27 15:02:39
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
