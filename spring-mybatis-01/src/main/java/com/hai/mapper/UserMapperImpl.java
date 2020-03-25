package com.hai.mapper;

import com.hai.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{


    // 之前使用Sqlseesion来执行，现在使用SqlsessionTemplate来执行

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> getAllUser() {
     return   sqlSession.getMapper(UserMapper.class).getAllUser();

    }
}
