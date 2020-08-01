package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author lizhennan
 * @version 1.0
 * @describe
 * @date 2020/8/1
 */

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getAllUsers(Map<String, Object> map){
        List<User> userList = userService.getAllUsers();
        map.put("userList", userList);
        return "list";
    }
}
