package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.EmployeeMapper;
import com.hcy.server.model.entity.EmployeeEntity;
import com.hcy.server.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * (Employee)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Service("employeeService")
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, EmployeeEntity> implements EmployeeService {

}