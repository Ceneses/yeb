package com.hcy.server.controller;

import com.hcy.server.model.entity.AdminEntity;
import com.hcy.server.model.entity.AdminLoginParam;
import com.hcy.server.model.vo.ResponseResult;
import com.hcy.server.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Optional;

/**
 * @ClassName LoginController
 * 用 Swagger 注解来代替 注释
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2021/3/10 21:01
 * @Version 1.0
 **/
@Api(tags = "LoginController")
@RestController
public class LoginController {
    @Autowired
    private AdminService adminService;

    @ApiOperation(value = "登录之后返回TOKEN")
    @PostMapping("/login")
    public ResponseResult login(AdminLoginParam adminLoginParam, HttpServletRequest httpServletRequest){
        return adminService.login(adminLoginParam.getUsername(), adminLoginParam.getPassword(), httpServletRequest);
    }

    @ApiOperation(value = "获取当前登录用户信息")
    @GetMapping("/admin/info")
    public ResponseResult getAdminInfo(Principal principal){
        String userName = principal.getName();
        AdminEntity adminEntity = adminService.getAdminByUsername(userName);
        adminEntity.setPassword(null);
        return ResponseResult.success(adminEntity);
    }


    @ApiOperation(value = "退出登录")
    @PostMapping("/logout")
    public ResponseResult logout(){
        return ResponseResult.success("注销成功！");
    }
}
