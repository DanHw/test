package com.doocker.crm.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doocker.crm.controller.common.EasyuiResult;
import com.doocker.crm.po.Student;
import com.doocker.crm.service.StudentService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping("get")
	//返回的student转换为json
	@ResponseBody
	public Student getStudent(Integer id){
		return studentService.getStudent(id);
		
	}
	@RequestMapping("list")
	@ResponseBody
	public EasyuiResult listStudent(
			@RequestParam(value="sname",required=false)String sname,
			@RequestParam(value="page",defaultValue="1")Integer page,
			@RequestParam(value="rows",defaultValue="3")Integer rows
			){
		PageInfo<HashMap> list=new PageInfo<HashMap>();
		try{
			list=studentService.selectListByPage(sname,page,rows);
		}catch(Exception e){e.printStackTrace();
		return new EasyuiResult(0L,null,false,"server error");
		}
		return new EasyuiResult(list.getTotal(),list.getList(),true,"success");
		
	}

	//getStudentByDeptId

	/**
	 * 
	 * 根据id删除student
	 */
	@RequestMapping("del")
	@ResponseBody
	public EasyuiResult delete(@RequestParam(value="id",required=true)Integer id){
		Integer ids  = 0;
		try {
			ids = studentService.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return new EasyuiResult(0L,null,false,"server error");
		}
		return new EasyuiResult(0L,ids,true,"success");
	}
	
	
	/**
	 *增加部门
	 */
	
	
	@RequestMapping("add")
	@ResponseBody
	public EasyuiResult add(Student student){
		student.setId(null);
		Integer ids=0;
		try {
			ids = studentService.add(student);
		} catch (Exception e) {
			e.printStackTrace();
			return new EasyuiResult(0L,null,false,"server error");
		}
		return new EasyuiResult(0L,ids,true,"success");
	}
	
	
	/**
	 *修改部门
	 */
	@RequestMapping("update")
	@ResponseBody
	public EasyuiResult update(Student student){
		Integer ids=0;
		try {
			ids = studentService.updateStudent(student);
		} catch (Exception e) {
			e.printStackTrace();
			return new EasyuiResult(0L,null,false,"server error");
		}
		return new EasyuiResult(0L,ids,true,"success");
	}
}
