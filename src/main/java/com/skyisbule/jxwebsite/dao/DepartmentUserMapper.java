package com.skyisbule.jxwebsite.dao;

import com.skyisbule.jxwebsite.domain.DepartmentUser;
import com.skyisbule.jxwebsite.domain.DepartmentUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentUserMapper {
    long countByExample(DepartmentUserExample example);

    int deleteByExample(DepartmentUserExample example);

    int insert(DepartmentUser record);

    int insertSelective(DepartmentUser record);

    List<DepartmentUser> selectByExample(DepartmentUserExample example);

    int updateByExampleSelective(@Param("record") DepartmentUser record, @Param("example") DepartmentUserExample example);

    int updateByExample(@Param("record") DepartmentUser record, @Param("example") DepartmentUserExample example);
}