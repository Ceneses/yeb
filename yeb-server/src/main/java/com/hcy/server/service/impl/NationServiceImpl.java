package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.NationMapper;
import com.hcy.server.model.entity.NationEntity;
import com.hcy.server.service.NationService;
import org.springframework.stereotype.Service;

/**
 * (Nation)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Service("nationService")
public class NationServiceImpl extends ServiceImpl<NationMapper, NationEntity> implements NationService {

}