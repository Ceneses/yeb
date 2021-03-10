package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.TPositionMapper;
import com.hcy.server.service.TPositionService;
import org.springframework.stereotype.Service;

/**
 * (TPosition)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:46:16
 */
@Service("tPositionService")
public class TPositionServiceImpl extends ServiceImpl<TPositionMapper, TPositionEntity> implements TPositionService {

}