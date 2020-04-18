package com.code.service;

import com.code.entity.RoleAction;
import java.util.List;

/**
 * (RoleAction)表服务接口
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
public interface RoleActionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RoleAction queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<RoleAction>selectAll();

    /**
     * 新增数据
     *
     * @param roleAction 实例对象
     * @return 实例对象
     */
    RoleAction insert(RoleAction roleAction);

    /**
     * 修改数据
     *
     * @param roleAction 实例对象
     * @return 实例对象
     */
    RoleAction update(RoleAction roleAction);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}