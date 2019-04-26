package com.hospital.theforth.mapper;

import com.hospital.theforth.bean.Department;


/**
 * @author  zyg
 */
public interface DepartmentMapper {
    /**
     * 查询doc信息
     * @param id
     * @return
     */
    public Department getDeptById(Integer id);
    /**
     * 删除doc信息
     * @param id
     * @return
     */
    public int deleteDeptById(Integer id);
    /**
     * 插入doc信息
     * @param department
     * @return
     */
    public int insertDept(Department department);
    /**
     * 更新doc信息
     * @param department
     * @return
     */
    public int updateDept(Department department);





}
