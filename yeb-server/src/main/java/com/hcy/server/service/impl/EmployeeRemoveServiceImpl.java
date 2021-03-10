package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.EmployeeRemoveMapper;
import com.hcy.server.model.entity.EmployeeRemoveEntity;
import com.hcy.server.service.EmployeeRemoveService;
import org.springframework.stereotype.Service;

/**
 * (EmployeeRemove)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Service("employeeRemoveService")
public class EmployeeRemoveServiceImpl extends ServiceImpl<EmployeeRemoveMapper, EmployeeRemoveEntity> implements EmployeeRemoveService {

}