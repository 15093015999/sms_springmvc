package com.kalearn.javaserver.web.controller;

import javax.annotation.Resource;

import com.kalearn.javaserver.bean.User;
import com.kalearn.javaserver.service.IUserService;
import com.kalearn.javaserver.util.ActionResult;
import com.kalearn.javaserver.util.ActionResultUtil;
import com.kalearn.javaserver.viewmodel.UpdateModel;

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
        return ActionResultUtil.success("sussess",userService.query(user));
    }    

    // @PostMapping("/add")
    @ApiOperation("添加")
    @GetMapping("/add")
    public void add(User user) {
        if (user != null) {
            try {
                userService.add(user);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @ApiOperation("删除指定")
    @GetMapping("/deleteById")
    public void deleteUserById(@ApiParam(value = "ID", required = true) @RequestParam(value = "id") Long id) {
        try {
            userService.deleteUserById(id);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @ApiOperation("删除全部")
    @GetMapping("/deleteAll")
    @Async
    public void deleteAll() {
        try {
            userService.deleteAll();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @ApiOperation("id查询")
    @GetMapping("/findById")
    public ActionResult findById(Long id) {
        return ActionResultUtil.success("sussess",userService.findById(id));
    }

    @ApiOperation("更新名字")
    @GetMapping("/updateNameById")
    public void updateNameById(UpdateModel model) {
        try {
            userService.updateNameById(model);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @GetMapping("/saveOrUpdate")
    public void saveOrUpdate(User user) {
        try {
            userService.saveOrUpdate(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}