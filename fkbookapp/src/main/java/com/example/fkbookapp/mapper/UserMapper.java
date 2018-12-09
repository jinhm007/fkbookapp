package com.example.fkbookapp.mapper;

import com.example.fkbookapp.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User  findWithLoginnameAndPassword(@Param("loginname") String loginname, @Param("password") String password);
}
