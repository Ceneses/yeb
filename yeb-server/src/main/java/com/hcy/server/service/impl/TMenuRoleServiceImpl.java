package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.TMenuRoleMapper;
import com.hcy.server.service.TMenuRoleService;
import org.springframework.stereotype.Service;

/**
 * (TMenuRole)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:46:16
 */
@Service("tMenuRoleService")
public class TMenuRoleServiceImpl extends ServiceImpl<TMenuRoleMapper, TMenuRoleEntity> implements TMenuRoleService {

}