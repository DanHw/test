package com.doocker.crm.service;

import java.util.HashMap;
import java.util.List;

import com.doocker.crm.po.Student;
import com.github.pagehelper.PageInfo;

public interface StudentService {
	Integer updateStudent(Student student);
	Integer deleteStudent(Integer id);
	Integer insertStudent(Student student);
	Student getStudent(Integer id);
	PageInfo<HashMap> selectListByPage(String sname, Integer page, Integer rows);
	Integer deleteById(Integer id);
	Integer add(Student student);
	

}
