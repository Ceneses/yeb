package com.hcy.server.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hcy.server.service.TEmployeeRemoveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import java.io.Serializable;
import java.util.List;

/**
 * (TEmployeeRemove)表控制层
 *
 * @author Cheney Han
 * @since 2021-03-10 16:46:16
 */
@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/tEmployeeRemove")
public class TEmployeeRemoveController extends ApiController {
    /**
     * 服务对象
     */
    @Autowired
    private TEmployeeRemoveService tEmployeeRemoveService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param tEmployeeRemove 查询实体
     * @return 所有数据
     */
    @GetMapping
    public Object selectAll(Page<TEmployeeRemoveEntity> page, TEmployeeRemoveEntity tEmployeeRemove) {
        return success(this.tEmployeeRemoveService.page(page, new QueryWrapper<>(tEmployeeRemove)));
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
        Page<TEmployeeRemoveEntity> page = new Page<>(pageNumber, pageSize);
        TEmployeeRemoveEntity tEmployeeRemove = new TEmployeeRemoveEntity();
        return success(this.tEmployeeRemoveService.page(page, new QueryWrapper<>(tEmployeeRemove)));
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public Object selectOne(@PathVariable Serializable id) {
        return success(this.tEmployeeRemoveService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param tEmployeeRemove 实体对象
     * @return 新增结果
     */
    @PostMapping("/insert")
    public Object insert(@RequestBody TEmployeeRemoveEntity tEmployeeRemove) {
        return success(this.tEmployeeRemoveService.save(tEmployeeRemove));
    }

    /**
     * 修改数据
     *
     * @param tEmployeeRemove 实体对象
     * @return 修改结果
     */
    @PutMapping("/update")
    public Object update(@RequestBody TEmployeeRemoveEntity tEmployeeRemove) {
        return success(this.tEmployeeRemoveService.updateById(tEmployeeRemove));
    }

    /**
     * 删除数据
     *
     * @param id 主键结合
     * @return 删除结果
     */
    @DeleteMapping("/deleteById")
    public Object delete(@RequestParam("id") Long id) {
        return success(this.tEmployeeRemoveService.removeById(id));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping("/deleteByIds")
    public Object delete(@RequestParam("idList") List<Long> idList) {
        return success(this.tEmployeeRemoveService.removeByIds(idList));
    }
}