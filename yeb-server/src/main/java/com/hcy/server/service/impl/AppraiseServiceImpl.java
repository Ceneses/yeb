package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.AppraiseMapper;
import com.hcy.server.model.entity.AppraiseEntity;
import com.hcy.server.service.AppraiseService;
import org.springframework.stereotype.Service;

/**
 * (Appraise)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Service("appraiseService")
public class AppraiseServiceImpl extends ServiceImpl<AppraiseMapper, AppraiseEntity> implements AppraiseService {

}