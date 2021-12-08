package com.pingjia.service;


import com.pingjia.pojo.User;

import java.util.List;

public interface PingJiaService {

    public List<User> findAll();

    public void  insert(User username);
}
