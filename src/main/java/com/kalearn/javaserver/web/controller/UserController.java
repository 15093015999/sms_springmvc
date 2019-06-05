package com.kalearn.javaserver.web.controller;

import javax.annotation.Resource;

import com.kalearn.javaserver.bean.User;
import com.kalearn.javaserver.dto.UpdateModel;
import com.kalearn.javaserver.service.IUserService;
import com.kalearn.javaserver.util.ActionResult;
import com.kalearn.javaserver.util.ActionResultUtil;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * UserController
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @ApiOperation("查询全部")
    @GetMapping("/findAll")
    public ActionResult findAll() {
        return ActionResultUtil.success("sussess", userService.findAll());
    }

    @ApiOperation("模糊查询")
    @GetMapping("/query")
    public ActionResult query(User user) {
        return ActionResultUtil.success("sussess", userService.query(user));
    }

    // @PostMapping("/add")
    @ApiOperation("添加")
    @GetMapping("/add")
    public ActionResult add(User user) {
        try {
            userService.add(user);
            return ActionResultUtil.success("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ActionResultUtil.error(e.getMessage());
        }
    }

    @ApiOperation("删除指定")
    @GetMapping("/deleteById")
    public ActionResult deleteUserById(@ApiParam(value = "ID", required = true) @RequestParam(value = "id") Long id) {
        try {
            userService.deleteUserById(id);
            return ActionResultUtil.success("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ActionResultUtil.error(e.getMessage());
        }
    }

    @ApiOperation("删除全部")
    @GetMapping("/deleteAll")
    @Async
    public ActionResult deleteAll() {
        try {
            userService.deleteAll();
            return ActionResultUtil.success("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ActionResultUtil.error(e.getMessage());
        }
    }

    @ApiOperation("id查询")
    @GetMapping("/findById")
    public ActionResult findById(Long id) {
        return ActionResultUtil.success("sussess", userService.findById(id));
    }

    @ApiOperation("更新名字")
    @GetMapping("/updateNameById")
    public ActionResult updateNameById(UpdateModel model) {
        try {
            userService.updateNameById(model);
            return ActionResultUtil.success("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ActionResultUtil.error(e.getMessage());
        }
    }

    @GetMapping("/saveOrUpdate")
    public ActionResult saveOrUpdate(User user) {
        try {
            userService.saveOrUpdate(user);
            return ActionResultUtil.success("更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ActionResultUtil.error(e.getMessage());
        }
    }

}