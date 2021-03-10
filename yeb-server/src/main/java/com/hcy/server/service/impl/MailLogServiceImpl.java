package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.MailLogMapper;
import com.hcy.server.model.entity.MailLogEntity;
import com.hcy.server.service.MailLogService;
import org.springframework.stereotype.Service;

/**
 * (MailLog)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Service("mailLogService")
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLogEntity> implements MailLogService {

}