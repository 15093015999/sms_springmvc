package com.kalearn.javaserver.web.controller;

import javax.annotation.Resource;

import com.kalearn.javaserver.service.IStudentCourseService;
import com.kalearn.javaserver.util.ActionResult;
import com.kalearn.javaserver.util.ActionResultUtil;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

/**
 * StudentCourseController
 */
@RestController
@RequestMapping("/studentcourse")
public class StudentCourseController {
    @Resource
    private IStudentCourseService studentCourseService;


    @ApiOperation("查询全部")
    @GetMapping("/findAll")
    @Async
    public ActionResult findAll() {
        return ActionResultUtil.success("success", studentCourseService.findAll());
    }
    @ApiOperation("查询全部包含学生名字,课程名")
    @GetMapping("/findAllWithStudentCourse")
    @Async
    public ActionResult findAllWithStudentCourse(){
        return ActionResultUtil.success("success",studentCourseService.findAllWithStudentCourse());   
    }

}