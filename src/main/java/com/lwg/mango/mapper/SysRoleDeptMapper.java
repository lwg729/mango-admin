package com.lwg.mango.mapper;

import com.lwg.mango.pojo.SysRoleDept;
import com.lwg.mango.pojo.SysRoleDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleDeptMapper {
    long countByExample(SysRoleDeptExample example);

    int deleteByExample(SysRoleDeptExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRoleDept record);

    int insertSelective(SysRoleDept record);

    List<SysRoleDept> selectByExample(SysRoleDeptExample example);

    SysRoleDept selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysRoleDept record, @Param("example") SysRoleDeptExample example);

    int updateByExample(@Param("record") SysRoleDept record, @Param("example") SysRoleDeptExample example);

    int updateByPrimaryKeySelective(SysRoleDept record);

    int updateByPrimaryKey(SysRoleDept record);
}