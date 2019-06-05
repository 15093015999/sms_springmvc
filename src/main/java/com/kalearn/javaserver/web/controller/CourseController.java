package com.kalearn.javaserver.web.controller;
/**
 * CourceController
 */

import java.util.List;

import javax.annotation.Resource;

import com.kalearn.javaserver.bean.Course;
import com.kalearn.javaserver.bean.extend.CourseExtend;
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
    public ActionResult addCourse(Course course) {
        try {
            courseService.addCourse(course);
            return ActionResultUtil.success("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ActionResultUtil.error(e.getMessage());
        }
    }

    @ApiOperation("删除")
    @GetMapping("/deleteById")
    public ActionResult deleteById(int id) {
        try {
            courseService.deleteById(id);
            return ActionResultUtil.success("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ActionResultUtil.error(e.getMessage());
        }
    }

    @ApiOperation("更新")
    @GetMapping("/saveOrUpdate")
    public ActionResult saveOrUpdate(Course course) {
        try {
            courseService.saveOrUpdate(course);
            return ActionResultUtil.success("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ActionResultUtil.error(e.getMessage());
        }
    }

    @ApiOperation("查询所有,课程中携带任课老师的信息")
    @GetMapping("findAllWithTeacher")
    public ActionResult findAllWithTeacher(){
        List<CourseExtend> list = courseService.findAllWithTeacher();
        return ActionResultUtil.success("success",list);
    }
}