package impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doocker.crm.mapper.DeptMapper;
import com.doocker.crm.mapper.StudentMapper;
import com.doocker.crm.po.Dept;
import com.doocker.crm.po.Student;
import com.doocker.crm.po.StudentExample;
import com.doocker.crm.po.StudentExample.Criteria;
import com.doocker.crm.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
	
	/*
	 * 网页传参数只传部门id,不传部门名称
	 * 要拿到部门的id从数据库中查询出名称然后再修改
	 */
	@Override
	public Integer updateStudent(Student student) {
		// TODO Auto-generated method stub
		if(null==student.getId()){
			return 0;
		}
		
		return studentMapper.updateByPrimaryKey(student);
	}
	@Override
	public Integer deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		return studentMapper.deleteByPrimaryKey(id);
	}
	/*
	 * 网页传参数只传部门id,不传部门名称
	 * 要拿到部门的id从数据库中查询出名称然后再插入
	 */
	@Override
	public Integer insertStudent(Student student) {
		// TODO Auto-generated method stub
		if(null!=student.getId()){
			return 0;
		}
		
		return studentMapper.insert(student);
	}
	@Override
	public Student getStudent(Integer id){
		return studentMapper.selectByPrimaryKey(id);
		
	}
	@Override
	public PageInfo<HashMap> selectListByPage(String sname, Integer page, Integer rows) {
		
		PageHelper.startPage(page,rows);
		List<HashMap> selectByExample=null;
		if(null!=sname){
		 selectByExample=studentMapper.selectByPage("%"+sname+"%");
		}else{
			selectByExample=studentMapper.selectByPage(null);
		}
		PageInfo<HashMap> info=new PageInfo(selectByExample);
 		return info;
	}
	@Override
	public Integer deleteById(Integer id) {
		// TODO Auto-generated method stub
		return studentMapper.deleteByPrimaryKey(id);
	}
	@Override
	public Integer add(Student student) {
		
		
		
		if( null != student.getId()){
			return 0;
		}
		
		return studentMapper.insert(student);
	}
	

}
