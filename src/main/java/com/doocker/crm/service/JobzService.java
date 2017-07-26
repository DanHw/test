package com.doocker.crm.service;

import com.doocker.crm.po.Jobz;
import com.github.pagehelper.PageInfo;

public interface JobzService {
	Integer updateJobz(Jobz jobz);
	Integer deleteJobz(Integer id);
	Integer insertJobz(Jobz jobz);
	Jobz getJobz(Integer id);
	PageInfo<Jobz> selectListByPage(String jobzName, Integer page, Integer rows);
	Integer deleteById(Integer id);
	Integer add(Jobz jobz);

}
