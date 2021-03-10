package com.hcy.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.server.mapper.TMenuMapper;
import com.hcy.server.service.TMenuService;
import org.springframework.stereotype.Service;

/**
 * (TMenu)表服务实现类
 *
 * @author Cheney Han
 * @since 2021-03-10 16:46:16
 */
@Service("tMenuService")
public class TMenuServiceImpl extends ServiceImpl<TMenuMapper, TMenuEntity> implements TMenuService {

}