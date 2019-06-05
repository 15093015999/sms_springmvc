package com.kalearn.javaserver.dao;

import java.util.List;

import com.kalearn.javaserver.bean.Course;

import org.apache.ibatis.annotations.Mapper;

/**
 * CourseMapper
 */
@Mapper
public interface CourseMapper {

    List<Course> findAll();
    List<Course> query(Course course);
    void addCourse(Course course);
    void deleteById(int id);
    void saveOrUpdate(Course course);

}