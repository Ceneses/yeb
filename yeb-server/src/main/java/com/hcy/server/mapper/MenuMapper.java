package com.hcy.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import com.hcy.server.model.entity.MenuEntity;

/**
 * (Menu)表数据库访问层
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Repository
public interface MenuMapper extends BaseMapper<MenuEntity> {

}