package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.EmployeeEcMapper;
import com.hcy.server.model.entity.EmployeeEcEntity;
import com.hcy.server.service.EmployeeEcService;
import org.springframework.stereotype.Service;

/**
 * (EmployeeEc)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Service("employeeEcService")
public class EmployeeEcServiceImpl extends ServiceImpl<EmployeeEcMapper, EmployeeEcEntity> implements EmployeeEcService {

}