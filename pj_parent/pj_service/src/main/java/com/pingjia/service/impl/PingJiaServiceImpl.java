package com.pingjia.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pingjia.mapper.UserMapper;
import com.pingjia.pojo.User;
import com.pingjia.service.PingJiaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class PingJiaServiceImpl implements PingJiaService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.selectByExample(null);
    }

    @Override
    public void insert(User username) {
    userMapper.insert(username);
    }
}
