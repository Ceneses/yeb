package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.TEmployeeTrainMapper;
import com.hcy.server.service.TEmployeeTrainService;
import org.springframework.stereotype.Service;

/**
 * (TEmployeeTrain)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:46:16
 */
@Service("tEmployeeTrainService")
public class TEmployeeTrainServiceImpl extends ServiceImpl<TEmployeeTrainMapper, TEmployeeTrainEntity> implements TEmployeeTrainService {

}