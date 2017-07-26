package com.doocker.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doocker.crm.controller.common.EasyuiResult;
import com.doocker.crm.po.Jobz;
import com.doocker.crm.service.JobzService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("jobz")
public class JobzController {
	@Autowired
	private JobzService jobzService;
	@RequestMapping("get")
	//返回的jobz转换为json
	@ResponseBody
	public Jobz getJobz(Integer id){
		return jobzService.getJobz(id);
		
	}
	@RequestMapping("list")
	@ResponseBody
	public EasyuiResult listJobz(
			@RequestParam(value="studentname",required=false)String studentname,
			@RequestParam(value="page",defaultValue="1")Integer page,
			@RequestParam(value="rows",defaultValue="3")Integer rows
			){
		PageInfo<Jobz> list=new PageInfo<Jobz>();
		try{
			list=jobzService.selectListByPage(studentname,page,rows);
		}catch(Exception e){e.printStackTrace();
		return new EasyuiResult(0L,null,false,"server error");
		}
		return new EasyuiResult(list.getTotal(),list.getList(),true,"success");
		
	}
	/**
	 * 
	 * 根据id删除jobz
	 */
	@RequestMapping("del")
	@ResponseBody
	public EasyuiResult delete(@RequestParam(value="id",required=true)Integer id){
		Integer ids  = 0;
		try {
			ids = jobzService.deleteById(id);
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
	public EasyuiResult add(Jobz jobz){
		jobz.setId(null);
		Integer ids=0;
		try {
			ids = jobzService.add(jobz);
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
	public EasyuiResult update(
			Jobz jobz){
		Integer ids=0;
		try {
			ids = jobzService.updateJobz(jobz);
		} catch (Exception e) {
			e.printStackTrace();
			return new EasyuiResult(0L,null,false,"server error");
		}
		return new EasyuiResult(0L,ids,true,"success");
	}
}
