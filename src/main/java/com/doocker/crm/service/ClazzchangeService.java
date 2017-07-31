package com.doocker.crm.service;

import java.util.HashMap;
import java.util.List;

import com.doocker.crm.po.Clazzchange;
import com.github.pagehelper.PageInfo;

public interface ClazzchangeService {
	Integer updateClazzchange(Clazzchange clazzchange);
	Integer deleteClazzchange(Integer id);
	Integer insertClazzchange(Clazzchange clazzchange);
	Clazzchange getClazzchange(Integer id);
	PageInfo<HashMap> selectListByPage(String sname, Integer page, Integer rows);
	Integer deleteById(Integer id);
	Integer add(Clazzchange clazzchange);
	

}
