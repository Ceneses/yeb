package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.AdminRoleMapper;
import com.hcy.server.model.entity.AdminRoleEntity;
import com.hcy.server.service.AdminRoleService;
import org.springframework.stereotype.Service;

/**
 * (AdminRole)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Service("adminRoleService")
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRoleEntity> implements AdminRoleService {

}