package com.doocker.crm.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doocker.crm.controller.common.EasyuiResult;
import com.doocker.crm.po.Clazzchange;
import com.doocker.crm.service.ClazzchangeService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("clazzchange")
public class ClazzchangeController {
	@Autowired
	private ClazzchangeService clazzchangeService;
	@RequestMapping("get")
	//返回的clazzchange转换为json
	@ResponseBody
	public Clazzchange getClazzchange(Integer id){
		return clazzchangeService.getClazzchange(id);
		
	}
	@RequestMapping("list")
	@ResponseBody
	public EasyuiResult listClazzchange(
			@RequestParam(value="sname",required=false)String sname,
			@RequestParam(value="page",defaultValue="1")Integer page,
			@RequestParam(value="rows",defaultValue="3")Integer rows
			){
		PageInfo<HashMap> list=new PageInfo<HashMap>();
		try{
			list=clazzchangeService.selectListByPage(sname,page,rows);
		}catch(Exception e){e.printStackTrace();
		return new EasyuiResult(0L,null,false,"server error");
		}
		return new EasyuiResult(list.getTotal(),list.getList(),true,"success");
		
	}

	//getClazzchangeByDeptId

	/**
	 * 
	 * 根据id删除clazzchange
	 */
	@RequestMapping("del")
	@ResponseBody
	public EasyuiResult delete(@RequestParam(value="id",required=true)Integer id){
		Integer ids  = 0;
		try {
			ids = clazzchangeService.deleteById(id);
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
	public EasyuiResult add(Clazzchange clazzchange){
		clazzchange.setId(null);
		Integer ids=0;
		try {
			ids = clazzchangeService.add(clazzchange);
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
	public EasyuiResult update(Clazzchange clazzchange){
		Integer ids=0;
		try {
			ids = clazzchangeService.updateClazzchange(clazzchange);
		} catch (Exception e) {
			e.printStackTrace();
			return new EasyuiResult(0L,null,false,"server error");
		}
		return new EasyuiResult(0L,ids,true,"success");
	}
}
