package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.OplogMapper;
import com.hcy.server.model.entity.OplogEntity;
import com.hcy.server.service.OplogService;
import org.springframework.stereotype.Service;

/**
 * (Oplog)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Service("oplogService")
public class OplogServiceImpl extends ServiceImpl<OplogMapper, OplogEntity> implements OplogService {

}