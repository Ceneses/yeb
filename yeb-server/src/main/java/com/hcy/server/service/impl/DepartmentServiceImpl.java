package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.DepartmentMapper;
import com.hcy.server.model.entity.DepartmentEntity;
import com.hcy.server.service.DepartmentService;
import org.springframework.stereotype.Service;

/**
 * (Department)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Service("departmentService")
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, DepartmentEntity> implements DepartmentService {

}