package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.SysMsgMapper;
import com.hcy.server.model.entity.SysMsgEntity;
import com.hcy.server.service.SysMsgService;
import org.springframework.stereotype.Service;

/**
 * (SysMsg)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Service("sysMsgService")
public class SysMsgServiceImpl extends ServiceImpl<SysMsgMapper, SysMsgEntity> implements SysMsgService {

}