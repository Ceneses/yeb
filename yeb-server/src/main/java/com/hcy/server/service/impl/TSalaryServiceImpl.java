package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.TSalaryMapper;
import com.hcy.server.service.TSalaryService;
import org.springframework.stereotype.Service;

/**
 * (TSalary)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:46:16
 */
@Service("tSalaryService")
public class TSalaryServiceImpl extends ServiceImpl<TSalaryMapper, TSalaryEntity> implements TSalaryService {

}