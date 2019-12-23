package com.example.demo.Employee;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeTDao {
    int deleteByPrimaryKey(Integer employeeid);

    int insert(EmployeeT record);

    int insertSelective(EmployeeT record);

    EmployeeT selectByPrimaryKey(Integer employeeid);

    int updateByPrimaryKeySelective(EmployeeT record);

    int updateByPrimaryKey(EmployeeT record);

    List<EmployeeT> findAll();

}