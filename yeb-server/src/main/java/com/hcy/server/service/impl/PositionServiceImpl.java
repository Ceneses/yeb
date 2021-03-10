package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.PositionMapper;
import com.hcy.server.model.entity.PositionEntity;
import com.hcy.server.service.PositionService;
import org.springframework.stereotype.Service;

/**
 * (Position)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Service("positionService")
public class PositionServiceImpl extends ServiceImpl<PositionMapper, PositionEntity> implements PositionService {

}