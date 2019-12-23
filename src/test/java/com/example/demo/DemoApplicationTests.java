package com.example.demo;

import com.example.demo.Employee.EmployeeT;
import com.example.demo.Employee.EmployeeTDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Resource
    EmployeeTDao employeeTDao;

    @Test
    void contextLoads() {
        EmployeeT employeeT = employeeTDao.selectByPrimaryKey(1);
        System.out.println(employeeT.toString());
    }

}
