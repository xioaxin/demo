package com.example.demo.Employee;

import com.example.demo.Employee.RolesT;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户角色Dao层
 *
 * @author ZPX
 */
@Mapper
public interface RolesTDao {
    /**
     * 插入用户角色记录
     * @param record
     * @return
     */
    int insert(RolesT record);

    int insertSelective(RolesT record);

    /**
     * 通过员工的编号查询员工的角色信息
     * @param employeeid
     * @return
     */
    RolesT selectRolesByemployeeid(Integer employeeid);
}