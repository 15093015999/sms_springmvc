package com.kalearn.javaserver.dao;

import java.util.List;

import com.kalearn.javaserver.bean.User;
import com.kalearn.javaserver.viewmodel.UpdateModel;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {
    List<User> findAll();
    List<User> query(User user);
    void add(User user);
    void deleteUserById(Long id);
    void deleteAll();
    User findById(Long id);
    void updateNameById(UpdateModel model);
    void saveOrUpdate(User user);
}