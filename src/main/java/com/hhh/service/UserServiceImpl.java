package com.hhh.service;

import com.hhh.dao.UserDao;
import com.hhh.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
}
