package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.JoblevelMapper;
import com.hcy.server.model.entity.JoblevelEntity;
import com.hcy.server.service.JoblevelService;
import org.springframework.stereotype.Service;

/**
 * (Joblevel)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Service("joblevelService")
public class JoblevelServiceImpl extends ServiceImpl<JoblevelMapper, JoblevelEntity> implements JoblevelService {

}