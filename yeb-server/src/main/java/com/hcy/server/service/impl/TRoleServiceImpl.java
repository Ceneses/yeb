package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.TRoleMapper;
import com.hcy.server.service.TRoleService;
import org.springframework.stereotype.Service;

/**
 * (TRole)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:46:16
 */
@Service("tRoleService")
public class TRoleServiceImpl extends ServiceImpl<TRoleMapper, TRoleEntity> implements TRoleService {

}