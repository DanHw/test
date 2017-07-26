package impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doocker.crm.mapper.JobzMapper;
import com.doocker.crm.po.Jobz;
import com.doocker.crm.po.JobzExample;
import com.doocker.crm.po.JobzExample.Criteria;
import com.doocker.crm.service.JobzService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class JobzServiceImpl implements JobzService {
	@Autowired
	private JobzMapper jobzMapper;
	@Override
	public Integer updateJobz(Jobz jobz) {
		// TODO Auto-generated method stub
		if(null==jobz.getId()){
			return 0;
		}
		return jobzMapper.updateByPrimaryKey(jobz);
	}
	@Override
	public Integer deleteJobz(Integer id) {
		// TODO Auto-generated method stub
		return jobzMapper.deleteByPrimaryKey(id);
	}
	@Override
	public Integer insertJobz(Jobz jobz) {
		// TODO Auto-generated method stub
		if(null!=jobz.getId()){
			return 0;
		}
		return jobzMapper.insert(jobz);
	}
	@Override
	public Jobz getJobz(Integer id){
		return jobzMapper.selectByPrimaryKey(id);
		
	}
	@Override
	public PageInfo<Jobz> selectListByPage(String studentName, Integer page, Integer rows) {
		// TODO Auto-generated method stub
		//example通过JobzExample来动态的增加修改查询条件
		JobzExample example=new JobzExample();
		if(null!=studentName){
			Criteria createrCriteria=example.createCriteria();
			createrCriteria.andStudentNameLike("%"+studentName+"%");
		}
		//分页插件的使用
		PageHelper.startPage(page,rows);
		List<Jobz> selectByExample=jobzMapper.selectByExample(example);
		PageInfo<Jobz> info=new PageInfo<>(selectByExample);
 		return info;
	}
	@Override
	public Integer deleteById(Integer id) {
		// TODO Auto-generated method stub
		return jobzMapper.deleteByPrimaryKey(id);
	}
	@Override
	public Integer add(Jobz jobz) {
		// TODO Auto-generated method stub
		return jobzMapper.insert(jobz);
	}
	

}
