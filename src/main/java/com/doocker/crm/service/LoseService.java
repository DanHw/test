package com.doocker.crm.service;

import java.util.HashMap;
import java.util.List;

import com.doocker.crm.po.Lose;
import com.github.pagehelper.PageInfo;

public interface LoseService {
	Integer updateLose(Lose lose);
	Integer deleteLose(Integer id);
	Integer insertLose(Lose lose);
	Lose getLose(Integer id);
	PageInfo<HashMap> selectListByPage(String loseName, Integer page, Integer rows);
	Integer deleteById(Integer id);
	Integer add(Lose lose);
	List<Lose> getLoseByDeptId(Integer deptId);

}
