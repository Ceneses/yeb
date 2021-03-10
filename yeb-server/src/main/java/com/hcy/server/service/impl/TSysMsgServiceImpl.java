package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.TSysMsgMapper;
import com.hcy.server.service.TSysMsgService;
import org.springframework.stereotype.Service;

/**
 * (TSysMsg)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:46:17
 */
@Service("tSysMsgService")
public class TSysMsgServiceImpl extends ServiceImpl<TSysMsgMapper, TSysMsgEntity> implements TSysMsgService {

}