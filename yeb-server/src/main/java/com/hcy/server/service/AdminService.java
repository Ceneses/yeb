package com.hcy.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcy.server.model.entity.AdminEntity;
import com.hcy.server.model.vo.ResponseResult;

import javax.servlet.http.HttpServletRequest;

/**
 * (Admin)表服务接口
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
public interface AdminService extends IService<AdminEntity> {
    /**
     * 登录之后返回 TOKEN
     * @param username
     * @param password
     * @param httpServletRequest
     * @return
     */
    ResponseResult login(String username, String password, String code, HttpServletRequest httpServletRequest);

    /**
     * 根据用户名查找Admin对象
     * @param userName
     * @return
     */
    AdminEntity getAdminByUsername(String userName);
}