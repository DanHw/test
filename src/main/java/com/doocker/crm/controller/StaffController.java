package com.doocker.crm.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doocker.crm.controller.common.EasyuiResult;
import com.doocker.crm.po.Staff;
import com.doocker.crm.service.StaffService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("staff")
public class StaffController {
	@Autowired
	private StaffService staffService;
	@RequestMapping("get")
	//返回的staff转换为json
	@ResponseBody
	public Staff getStaff(Integer id){
		return staffService.getStaff(id);
		
	}
	@RequestMapping("list")
	@ResponseBody
	public EasyuiResult listStaff(
			@RequestParam(value="staffname",required=false)String staffName,
			@RequestParam(value="page",defaultValue="1")Integer page,
			@RequestParam(value="rows",defaultValue="3")Integer rows
			){
		PageInfo<HashMap> list=new PageInfo<HashMap>();
		try{
			list=staffService.selectListByPage(staffName,page,rows);
		}catch(Exception e){e.printStackTrace();
		return new EasyuiResult(0L,null,false,"server error");
		}
		return new EasyuiResult(list.getTotal(),list.getList(),true,"success");
		
	}
	/**
	 * 
	 * 根据id删除staff
	 */
	@RequestMapping("del")
	@ResponseBody
	public EasyuiResult delete(@RequestParam(value="id",required=true)Integer id){
		Integer ids  = 0;
		try {
			ids = staffService.deleteById(id);
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
	public EasyuiResult add(Staff staff){
		staff.setId(null);
		Integer ids=0;
		try {
			ids = staffService.add(staff);
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
	public EasyuiResult update(Staff staff){
		Integer ids=0;
		try {
			ids = staffService.updateStaff(staff);
		} catch (Exception e) {
			e.printStackTrace();
			return new EasyuiResult(0L,null,false,"server error");
		}
		return new EasyuiResult(0L,ids,true,"success");
	}
}
