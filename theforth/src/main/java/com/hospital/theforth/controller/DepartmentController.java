package com.hospital.theforth.controller;

import com.hospital.theforth.bean.Department;
import com.hospital.theforth.bean.Doctor;
import com.hospital.theforth.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyg
 */

@RestController
public class DepartmentController {

    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDocById(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/delDept/{id}")
    public int delDeptById(@PathVariable("id") Integer id){
        return departmentMapper.deleteDeptById(id);
    }


    @GetMapping("/insertDept")
    public int insertDeptById(Department department){
        return departmentMapper.insertDept(department);
    }

    @GetMapping("/updateDept")
    public int updateDeptById(Department department){
        return departmentMapper.updateDept(department);
    }
}
