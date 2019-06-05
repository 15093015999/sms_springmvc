package com.kalearn.javaserver.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.kalearn.javaserver.bean.User;
import com.kalearn.javaserver.dao.UserMapper;
import com.kalearn.javaserver.service.IUserService;
import com.kalearn.javaserver.viewmodel.UpdateModel;

import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void add(User user) throws Exception {
        userMapper.add(user);
    }

    @Override
    public void deleteUserById(Long id) throws Exception {
        userMapper.deleteUserById(id);
    }

    @Override
    public void deleteAll() throws Exception {
        userMapper.deleteAll();
    }

    @Override
    public User findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public void updateNameById(UpdateModel model) throws Exception {
        userMapper.updateNameById(model);
    }

    @Override
    public void saveOrUpdate(User user) throws Exception {
        userMapper.saveOrUpdate(user);
    }

    @Override
    public List<User> query(User user) {
        return userMapper.query(user);
    }

}