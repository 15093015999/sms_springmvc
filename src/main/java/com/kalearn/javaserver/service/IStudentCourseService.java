package com.kalearn.javaserver.service;

import java.util.List;

import com.kalearn.javaserver.bean.StudentCourse;
import com.kalearn.javaserver.bean.extend.StudentCourseExtend;

/**
 * IStudentCourseService
 */
public interface IStudentCourseService {

    List<StudentCourse> findAll();

    List<StudentCourseExtend> findAllWithStudentCourse();
}