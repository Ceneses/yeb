package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.TOplogMapper;
import com.hcy.server.service.TOplogService;
import org.springframework.stereotype.Service;

/**
 * (TOplog)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:46:16
 */
@Service("tOplogService")
public class TOplogServiceImpl extends ServiceImpl<TOplogMapper, TOplogEntity> implements TOplogService {

}