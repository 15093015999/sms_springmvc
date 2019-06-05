package com.kalearn.javaserver.web.controller;
/**
 * CourceController
 */

import javax.annotation.Resource;

import com.kalearn.javaserver.bean.Course;
import com.kalearn.javaserver.service.ICourseService;
import com.kalearn.javaserver.util.ActionResult;
import com.kalearn.javaserver.util.ActionResultUtil;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/course")
public class CourseController {

    @Resource
    private ICourseService courseService;


    @ApiOperation("查询全部")
    @GetMapping("/findAll")
    public ActionResult findAll() {
        return ActionResultUtil.success("sussess", courseService.findAll());
        
    }
 
    @ApiOperation("模糊查询")
    @GetMapping("/query")
    public ActionResult query(Course course) {
		return ActionResultUtil.success("sussess", courseService.query(course));
    }

    @ApiOperation("添加课程")
    @GetMapping("/add")
    public void addCourse(Course course) {
        courseService.addCourse(course);
    }

    @ApiOperation("删除")
    @GetMapping("/deleteById")
    public void deleteById(int id) {
        courseService.deleteById(id);
    }

    @ApiOperation("更新")
    @GetMapping("/saveOrUpdate")
    public void saveOrUpdate(Course course) {
        courseService.saveOrUpdate(course);
    }
}