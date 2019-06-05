package com.kalearn.javaserver.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.kalearn.javaserver.bean.Course;
import com.kalearn.javaserver.dao.CourseMapper;
import com.kalearn.javaserver.service.ICourseService;

import org.springframework.stereotype.Service;


@Service
public class CourseServiceImpl implements ICourseService {
    @Resource
    private CourseMapper courseMapper;

    @Override
    public List<Course> findAll() {
        return courseMapper.findAll();
    }

    @Override
    public List<Course> query(Course course) {
        return courseMapper.query(course);
    }

    @Override
    public void addCourse(Course course) {
        courseMapper.addCourse(course);
    }

    @Override
    public void deleteById(int id) {
        courseMapper.deleteById(id);
    }

    @Override
    public void saveOrUpdate(Course course) {
        courseMapper.saveOrUpdate(course);
    }

    
}