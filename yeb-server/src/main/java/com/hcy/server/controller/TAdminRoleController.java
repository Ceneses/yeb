package com.hcy.server.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hcy.server.service.TAdminRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import java.io.Serializable;
import java.util.List;

/**
 * (TAdminRole)表控制层
 *
 * @author Cheney Han
 * @since 2021-03-10 16:46:15
 */
@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/tAdminRole")
public class TAdminRoleController extends ApiController {
    /**
     * 服务对象
     */
    @Autowired
    private TAdminRoleService tAdminRoleService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param tAdminRole 查询实体
     * @return 所有数据
     */
    @GetMapping
    public Object selectAll(Page<TAdminRoleEntity> page, TAdminRoleEntity tAdminRole) {
        return success(this.tAdminRoleService.page(page, new QueryWrapper<>(tAdminRole)));
    }

    /**
     * 分页查询所有数据
     *
     * @param pageNumber 分页序号
     * @param pageSize 分页数量
     * @return 所有数据
     */
    @GetMapping("/pageLimit")
    public Object selectByPage(@RequestParam("pageNumber") int pageNumber, @RequestParam("pageSize") int pageSize) {
        Page<TAdminRoleEntity> page = new Page<>(pageNumber, pageSize);
        TAdminRoleEntity tAdminRole = new TAdminRoleEntity();
        return success(this.tAdminRoleService.page(page, new QueryWrapper<>(tAdminRole)));
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public Object selectOne(@PathVariable Serializable id) {
        return success(this.tAdminRoleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param tAdminRole 实体对象
     * @return 新增结果
     */
    @PostMapping("/insert")
    public Object insert(@RequestBody TAdminRoleEntity tAdminRole) {
        return success(this.tAdminRoleService.save(tAdminRole));
    }

    /**
     * 修改数据
     *
     * @param tAdminRole 实体对象
     * @return 修改结果
     */
    @PutMapping("/update")
    public Object update(@RequestBody TAdminRoleEntity tAdminRole) {
        return success(this.tAdminRoleService.updateById(tAdminRole));
    }

    /**
     * 删除数据
     *
     * @param id 主键结合
     * @return 删除结果
     */
    @DeleteMapping("/deleteById")
    public Object delete(@RequestParam("id") Long id) {
        return success(this.tAdminRoleService.removeById(id));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping("/deleteByIds")
    public Object delete(@RequestParam("idList") List<Long> idList) {
        return success(this.tAdminRoleService.removeByIds(idList));
    }
}