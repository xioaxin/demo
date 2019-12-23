package com.example.demo.Department;

import org.apache.ibatis.annotations.Mapper;

/**
 * 部门Dao层
 *
 * @author ZPX
 */
@Mapper
public interface DepartmentTDao {
    /**
     * 通过主键删除对应的部门信息
     *
     * @param departmentid
     * @return
     */
    int deleteByPrimaryKey(Integer departmentid);

    /**
     * 插入一个员工的记录
     *
     * @param record
     * @return
     */
    int insert(DepartmentT record);

    int insertSelective(DepartmentT record);

    /**
     * 通过主键部门编号查询部门信息
     *
     * @param departmentid
     * @return
     */
    DepartmentT selectByPrimaryKey(Integer departmentid);

    int updateByPrimaryKeySelective(DepartmentT record);

    /**
     * 更新部门的记录
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(DepartmentT record);
}