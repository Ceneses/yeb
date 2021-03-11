package com.hcy.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hcy.server.model.entity.MenuEntity;
import org.springframework.stereotype.Repository;
import com.hcy.server.model.entity.AdminEntity;

import java.util.List;

/**
 * (Admin)表数据库访问层
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:32
 */
@Repository
public interface AdminMapper extends BaseMapper<AdminEntity> {
    /**
     * 通过用户ID查询菜单列表
     * @param id
     * @return
     */
    List<MenuEntity> getMenusByAdminId(Integer id);
}