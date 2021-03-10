package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.TNationMapper;
import com.hcy.server.service.TNationService;
import org.springframework.stereotype.Service;

/**
 * (TNation)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:46:16
 */
@Service("tNationService")
public class TNationServiceImpl extends ServiceImpl<TNationMapper, TNationEntity> implements TNationService {

}