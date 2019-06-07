package com.kalearn.javaserver.dao.extend;

import java.util.List;

import com.kalearn.javaserver.bean.extend.StudentCourseExtend;

import org.apache.ibatis.annotations.Mapper;

/**
 * StudentCourseExtendMapper
 */
@Mapper
public interface StudentCourseExtendMapper {

    List<StudentCourseExtend> selectAll();
}