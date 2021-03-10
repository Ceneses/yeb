package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.EmployeeTrainMapper;
import com.hcy.server.model.entity.EmployeeTrainEntity;
import com.hcy.server.service.EmployeeTrainService;
import org.springframework.stereotype.Service;

/**
 * (EmployeeTrain)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Service("employeeTrainService")
public class EmployeeTrainServiceImpl extends ServiceImpl<EmployeeTrainMapper, EmployeeTrainEntity> implements EmployeeTrainService {

}