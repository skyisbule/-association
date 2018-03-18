package com.skyisbule.jxwebsite.dao;

import com.skyisbule.jxwebsite.domain.DepartmentName;
import com.skyisbule.jxwebsite.domain.DepartmentNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentNameMapper {
    long countByExample(DepartmentNameExample example);

    int deleteByExample(DepartmentNameExample example);

    int deleteByPrimaryKey(Integer bmId);

    int insert(DepartmentName record);

    int insertSelective(DepartmentName record);

    List<DepartmentName> selectByExample(DepartmentNameExample example);

    DepartmentName selectByPrimaryKey(Integer bmId);

    int updateByExampleSelective(@Param("record") DepartmentName record, @Param("example") DepartmentNameExample example);

    int updateByExample(@Param("record") DepartmentName record, @Param("example") DepartmentNameExample example);

    int updateByPrimaryKeySelective(DepartmentName record);

    int updateByPrimaryKey(DepartmentName record);
}