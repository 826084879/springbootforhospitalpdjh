package com.hospital.theforth.controller;

import com.hospital.theforth.bean.Doctor;
import com.hospital.theforth.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyg
 */

@RestController
public class DoctorController {

    @Autowired
    DoctorMapper doctorMapper;

    @GetMapping("/doc/{id}")
    public Doctor getDocById(@PathVariable("id") Integer id){
        return doctorMapper.getDocById(id);
    }

    @GetMapping("/insertDoc")
    public int insertDoc(Doctor doctor){
        return doctorMapper.insertDoc(doctor);
    }

    /**查询所有员工返回列表页面
     *
     * @param model
     * @return
     */
    @GetMapping("/docs")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        //放在请求域中
        model.addAttribute("emps", employees);
        // thymeleaf默认就会拼串
        // classpath:/templates/xxxx.html
        return "doc/list";
    }

}
