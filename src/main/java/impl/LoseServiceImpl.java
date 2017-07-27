package impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doocker.crm.mapper.DeptMapper;
import com.doocker.crm.mapper.LoseMapper;
import com.doocker.crm.po.Dept;
import com.doocker.crm.po.Lose;
import com.doocker.crm.po.LoseExample;
import com.doocker.crm.po.LoseExample.Criteria;
import com.doocker.crm.service.LoseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class LoseServiceImpl implements LoseService {
	@Autowired
	private LoseMapper loseMapper;
	
	/*
	 * 网页传参数只传部门id,不传部门名称
	 * 要拿到部门的id从数据库中查询出名称然后再修改
	 */
	@Override
	public Integer updateLose(Lose lose) {
		// TODO Auto-generated method stub
		if(null==lose.getId()){
			return 0;
		}
		
		return loseMapper.updateByPrimaryKey(lose);
	}
	@Override
	public Integer deleteLose(Integer id) {
		// TODO Auto-generated method stub
		return loseMapper.deleteByPrimaryKey(id);
	}
	/*
	 * 网页传参数只传部门id,不传部门名称
	 * 要拿到部门的id从数据库中查询出名称然后再插入
	 */
	@Override
	public Integer insertLose(Lose lose) {
		// TODO Auto-generated method stub
		if(null!=lose.getId()){
			return 0;
		}
		
		return loseMapper.insert(lose);
	}
	@Override
	public Lose getLose(Integer id){
		return loseMapper.selectByPrimaryKey(id);
		
	}
	@Override
	public PageInfo<HashMap> selectListByPage(String bywho, Integer page, Integer rows) {
		
		PageHelper.startPage(page,rows);
		List<HashMap> selectByExample=loseMapper.selectByPage("%"+bywho+"%");
		PageInfo<HashMap> info=new PageInfo<>(selectByExample);
 		return info;
	}
	@Override
	public Integer deleteById(Integer id) {
		// TODO Auto-generated method stub
		return loseMapper.deleteByPrimaryKey(id);
	}
	@Override
	public Integer add(Lose lose) {
		
		
		
		if( null != lose.getId()){
			return 0;
		}
		
		return loseMapper.insert(lose);
	}
	

}
