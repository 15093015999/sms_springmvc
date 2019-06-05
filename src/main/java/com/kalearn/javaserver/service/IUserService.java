package com.kalearn.javaserver.service;

import java.util.List;

import com.kalearn.javaserver.bean.User;
import com.kalearn.javaserver.viewmodel.UpdateModel;

public interface IUserService {

    List<User> findAll();
    List<User> query(User user);
    void add(User user) throws Exception;
    void deleteUserById(Long id) throws Exception;
    void deleteAll() throws Exception;
    User findById(Long id);
    void updateNameById(UpdateModel model) throws Exception;
    void saveOrUpdate(User user) throws Exception;
}