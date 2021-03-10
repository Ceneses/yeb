package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.SalaryAdjustMapper;
import com.hcy.server.model.entity.SalaryAdjustEntity;
import com.hcy.server.service.SalaryAdjustService;
import org.springframework.stereotype.Service;

/**
 * (SalaryAdjust)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Service("salaryAdjustService")
public class SalaryAdjustServiceImpl extends ServiceImpl<SalaryAdjustMapper, SalaryAdjustEntity> implements SalaryAdjustService {

}