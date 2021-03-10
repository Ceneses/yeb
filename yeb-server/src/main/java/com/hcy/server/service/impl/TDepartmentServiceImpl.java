package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.TDepartmentMapper;
import com.hcy.server.service.TDepartmentService;
import org.springframework.stereotype.Service;

/**
 * (TDepartment)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:46:16
 */
@Service("tDepartmentService")
public class TDepartmentServiceImpl extends ServiceImpl<TDepartmentMapper, TDepartmentEntity> implements TDepartmentService {

}