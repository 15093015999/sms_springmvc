package com.kalearn.javaserver.service;

import java.util.List;

import com.kalearn.javaserver.bean.Course;
import com.kalearn.javaserver.bean.extend.CourseExtend;

/**
 * ICourseService
 */
public interface ICourseService {

    List<Course> findAll();
    List<Course> query(Course course);
    void addCourse(Course course) throws Exception;
    void deleteById(int id) throws Exception;
    void saveOrUpdate(Course course) throws Exception;
    List<CourseExtend> findAllWithTeacher();
}