package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.TEmployeeMapper;
import com.hcy.server.service.TEmployeeService;
import org.springframework.stereotype.Service;

/**
 * (TEmployee)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:46:16
 */
@Service("tEmployeeService")
public class TEmployeeServiceImpl extends ServiceImpl<TEmployeeMapper, TEmployeeEntity> implements TEmployeeService {

}