package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.SysMsgContentMapper;
import com.hcy.server.model.entity.SysMsgContentEntity;
import com.hcy.server.service.SysMsgContentService;
import org.springframework.stereotype.Service;

/**
 * (SysMsgContent)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Service("sysMsgContentService")
public class SysMsgContentServiceImpl extends ServiceImpl<SysMsgContentMapper, SysMsgContentEntity> implements SysMsgContentService {

}