package com.kalearn.javaserver.dao.extend;

import java.util.List;

import com.kalearn.javaserver.bean.extend.CourseExtend;

import org.apache.ibatis.annotations.Mapper;

/**
 * CourseExtendMapper
 */
@Mapper
public interface CourseExtendMapper {
    List<CourseExtend> selectAll();
}
