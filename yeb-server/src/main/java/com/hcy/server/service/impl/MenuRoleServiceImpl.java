package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.MenuRoleMapper;
import com.hcy.server.model.entity.MenuRoleEntity;
import com.hcy.server.service.MenuRoleService;
import org.springframework.stereotype.Service;

/**
 * (MenuRole)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Service("menuRoleService")
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRoleEntity> implements MenuRoleService {

}