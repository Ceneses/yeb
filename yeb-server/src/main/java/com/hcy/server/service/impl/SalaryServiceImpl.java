package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.SalaryMapper;
import com.hcy.server.model.entity.SalaryEntity;
import com.hcy.server.service.SalaryService;
import org.springframework.stereotype.Service;

/**
 * (Salary)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Service("salaryService")
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, SalaryEntity> implements SalaryService {

}