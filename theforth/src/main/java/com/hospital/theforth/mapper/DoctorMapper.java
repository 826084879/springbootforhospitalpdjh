package com.hospital.theforth.mapper;

import com.hospital.theforth.bean.Doctor;

/**
 * @author zyg
 */
public interface DoctorMapper {
    /**
     * 查询doc信息
     * @param id
     * @return
     */
    public Doctor getDocById(Integer id);

    /**
     * 插入doc记录
     * @param doctor
     * @return int
     */
    public int insertDoc(Doctor doctor);

    /**
     * 删除doc记录
     * @param id
     * @return int
     */
    public int delDoc(Integer id);

    /**
     * 修改doc记录
     * @param doctor
     * @return int
     */
    public int updateDoc(Doctor doctor);
}
