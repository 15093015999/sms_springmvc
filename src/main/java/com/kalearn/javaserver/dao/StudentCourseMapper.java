package com.kalearn.javaserver.dao;

import java.util.List;

import com.kalearn.javaserver.bean.StudentCourse;

import org.apache.ibatis.annotations.Mapper;

/**
 * StudentCourse
 */
@Mapper
public interface StudentCourseMapper {

    List<StudentCourse> findAll();
}