package impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doocker.crm.mapper.StaffMapper;
import com.doocker.crm.po.Staff;
import com.doocker.crm.service.StaffService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class StaffServiceImpl implements StaffService {
	@Autowired
	private StaffMapper staffMapper;
	
	
	@Override
	public Integer updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		if(null==staff.getId()){
			return 0;
		}
		
		return staffMapper.updateByPrimaryKey(staff);
	}
	@Override
	public Integer deleteStaff(Integer id) {
		// TODO Auto-generated method stub
		return staffMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public Integer insertStaff(Staff staff) {
		// TODO Auto-generated method stub
		if(null!=staff.getId()){
			return 0;
		}
		
		return staffMapper.insert(staff);
	}
	@Override
	public Staff getStaff(Integer id){
		return staffMapper.selectByPrimaryKey(id);
		
	}
	@Override
	public PageInfo<HashMap> selectListByPage(String staffName, Integer page, Integer rows) {
		// TODO Auto-generated method stub
		//example通过StaffExample来动态的增加修改查询条件
		
		//分页插件的使用
		PageHelper.startPage(page,rows);
		List<HashMap> selectByExample=null;
		if(null!=staffName){
		 selectByExample=staffMapper.selectByPage("%"+staffName+"%");
		}else{
			selectByExample=staffMapper.selectByPage(null);
		}
		PageInfo<HashMap> info=new PageInfo(selectByExample);
 		return info;
	}
	@Override
	public Integer deleteById(Integer id) {
		// TODO Auto-generated method stub
		return staffMapper.deleteByPrimaryKey(id);
	}
	@Override
	public Integer add(Staff staff) {
		
		
		if( null != staff.getId()){
			return 0;
		}
	
		
		return staffMapper.insert(staff);
	}
	

}