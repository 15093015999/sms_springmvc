package com.kalearn.javaserver.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.kalearn.javaserver.bean.StudentCourse;
import com.kalearn.javaserver.bean.extend.StudentCourseExtend;
import com.kalearn.javaserver.dao.StudentCourseMapper;
import com.kalearn.javaserver.dao.extend.StudentCourseExtendMapper;
import com.kalearn.javaserver.service.IStudentCourseService;

import org.springframework.stereotype.Service;

/**
 * StudentCourseImpl
 */
@Service
public class StudentCourseImpl implements IStudentCourseService {
    @Resource
    private StudentCourseMapper studentCourseMapper;

    @Resource
    private StudentCourseExtendMapper studentCourseExtendMapper;

    @Override
    public List<StudentCourse> findAll() {
        return studentCourseMapper.findAll();
    }

    @Override
    public List<StudentCourseExtend> findAllWithStudentCourse() {
        return studentCourseExtendMapper.selectAll();
    }


    
}