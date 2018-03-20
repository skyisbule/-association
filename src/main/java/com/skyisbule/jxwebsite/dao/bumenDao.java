package com.skyisbule.jxwebsite.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by skyisbule on 2018/3/20.
 */
@Mapper
public interface bumenDao {

    @Select("select * from user join department_user on user.Id = department_user.user_id where user.Id = #{id};")
    public Map<String,Object> getUserAndhisBumen(@Param("id")int id);

}
