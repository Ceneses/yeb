package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.TMailLogMapper;
import com.hcy.server.service.TMailLogService;
import org.springframework.stereotype.Service;

/**
 * (TMailLog)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:46:16
 */
@Service("tMailLogService")
public class TMailLogServiceImpl extends ServiceImpl<TMailLogMapper, TMailLogEntity> implements TMailLogService {

}