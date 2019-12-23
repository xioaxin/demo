package com.example.demo.Employee;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description
 *
 * @Author ZPX
 * @Date Created in 2019-12-23 15:39
 * @Version 1.0
 */
@Service
public class RolesTService {
    @Resource
    private RolesTDao rolesTDao;
    public RolesT selectById(Integer id) {
        return rolesTDao.selectRolesByemployeeid(id);
    }
}
