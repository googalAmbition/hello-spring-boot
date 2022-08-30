package com.tcoding.demo.mybatis.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tcoding.demo.mybatis.mbg.entity.SysUser;
import org.apache.ibatis.annotations.Options;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author tc
 * @since 2022-08-29
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    @Override
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    int insert(SysUser entity);
}
