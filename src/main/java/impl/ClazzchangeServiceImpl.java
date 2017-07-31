package impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doocker.crm.mapper.DeptMapper;
import com.doocker.crm.mapper.ClazzchangeMapper;
import com.doocker.crm.po.Dept;
import com.doocker.crm.po.Clazzchange;
import com.doocker.crm.po.ClazzchangeExample;
import com.doocker.crm.po.ClazzchangeExample.Criteria;
import com.doocker.crm.service.ClazzchangeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ClazzchangeServiceImpl implements ClazzchangeService {
	@Autowired
	private ClazzchangeMapper clazzchangeMapper;
	
	/*
	 * 网页传参数只传部门id,不传部门名称
	 * 要拿到部门的id从数据库中查询出名称然后再修改
	 */
	@Override
	public Integer updateClazzchange(Clazzchange clazzchange) {
		// TODO Auto-generated method stub
		if(null==clazzchange.getId()){
			return 0;
		}
		
		return clazzchangeMapper.updateByPrimaryKey(clazzchange);
	}
	@Override
	public Integer deleteClazzchange(Integer id) {
		// TODO Auto-generated method stub
		return clazzchangeMapper.deleteByPrimaryKey(id);
	}
	/*
	 * 网页传参数只传部门id,不传部门名称
	 * 要拿到部门的id从数据库中查询出名称然后再插入
	 */
	@Override
	public Integer insertClazzchange(Clazzchange clazzchange) {
		// TODO Auto-generated method stub
		if(null!=clazzchange.getId()){
			return 0;
		}
		
		return clazzchangeMapper.insert(clazzchange);
	}
	@Override
	public Clazzchange getClazzchange(Integer id){
		return clazzchangeMapper.selectByPrimaryKey(id);
		
	}
	@Override
	public PageInfo<HashMap> selectListByPage(String sname, Integer page, Integer rows) {
		
		PageHelper.startPage(page,rows);
		List<HashMap> selectByExample=null;
		if(null!=sname){
		 selectByExample=clazzchangeMapper.selectByPage("%"+sname+"%");
		}else{
			selectByExample=clazzchangeMapper.selectByPage(null);
		}
		PageInfo<HashMap> info=new PageInfo(selectByExample);
 		return info;
	}
	@Override
	public Integer deleteById(Integer id) {
		// TODO Auto-generated method stub
		return clazzchangeMapper.deleteByPrimaryKey(id);
	}
	@Override
	public Integer add(Clazzchange clazzchange) {
		
		
		
		if( null != clazzchange.getId()){
			return 0;
		}
		
		return clazzchangeMapper.insert(clazzchange);
	}
	

}
