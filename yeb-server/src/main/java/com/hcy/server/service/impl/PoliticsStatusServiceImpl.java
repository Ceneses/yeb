package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.PoliticsStatusMapper;
import com.hcy.server.model.entity.PoliticsStatusEntity;
import com.hcy.server.service.PoliticsStatusService;
import org.springframework.stereotype.Service;

/**
 * (PoliticsStatus)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Service("politicsStatusService")
public class PoliticsStatusServiceImpl extends ServiceImpl<PoliticsStatusMapper, PoliticsStatusEntity> implements PoliticsStatusService {

}