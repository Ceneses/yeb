package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.TAdminRoleMapper;
import com.hcy.server.service.TAdminRoleService;
import org.springframework.stereotype.Service;

/**
 * (TAdminRole)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:46:15
 */
@Service("tAdminRoleService")
public class TAdminRoleServiceImpl extends ServiceImpl<TAdminRoleMapper, TAdminRoleEntity> implements TAdminRoleService {

}