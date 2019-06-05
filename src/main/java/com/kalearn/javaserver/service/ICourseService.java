package com.kalearn.javaserver.service;

import java.util.List;

import com.kalearn.javaserver.bean.Course;

/**
 * ICourseService
 */
public interface ICourseService {

    List<Course> findAll();
    List<Course> query(Course course);
    void addCourse(Course course);
    void deleteById(int id);
    void saveOrUpdate(Course course);
}