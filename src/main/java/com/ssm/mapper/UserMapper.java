package com.ssm.mapper;

import com.ssm.entity.User;

import java.util.List;

/**
 * @author lizhennan
 * @version 1.0
 * @describe
 * @date 2020/7/28
 */
public interface UserMapper {

    List<User> queryAllUser();
}
