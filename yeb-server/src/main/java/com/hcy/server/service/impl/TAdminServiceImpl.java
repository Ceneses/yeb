package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.TAdminMapper;
import com.hcy.server.service.TAdminService;
import org.springframework.stereotype.Service;

/**
 * (TAdmin)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:46:15
 */
@Service("tAdminService")
public class TAdminServiceImpl extends ServiceImpl<TAdminMapper, TAdminEntity> implements TAdminService {

}