package com.hcy.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import com.hcy.server.model.entity.NationEntity;

/**
 * (Nation)表数据库访问层
 *
 * @author Cheney Han
 * @since 2021-03-10 16:47:33
 */
@Repository
public interface NationMapper extends BaseMapper<NationEntity> {

}