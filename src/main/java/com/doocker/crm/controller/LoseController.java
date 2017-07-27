package com.doocker.crm.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doocker.crm.controller.common.EasyuiResult;
import com.doocker.crm.po.Lose;
import com.doocker.crm.service.LoseService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("lose")
public class LoseController {
	@Autowired
	private LoseService loseService;
	@RequestMapping("get")
	//返回的lose转换为json
	@ResponseBody
	public Lose getLose(Integer id){
		return loseService.getLose(id);
		
	}
	@RequestMapping("list")
	@ResponseBody
	public EasyuiResult listLose(
			@RequestParam(value="bywho",required=false)String bywho,
			@RequestParam(value="page",defaultValue="1")Integer page,
			@RequestParam(value="rows",defaultValue="3")Integer rows
			){
		PageInfo<HashMap> list=new PageInfo<HashMap>();
		try{
			list=loseService.selectListByPage(bywho,page,rows);
		}catch(Exception e){e.printStackTrace();
		return new EasyuiResult(0L,null,false,"server error");
		}
		return new EasyuiResult(list.getTotal(),list.getList(),true,"success");
		
	}

	//getLoseByDeptId
	// 根据部门id查询改部门的职位
	@RequestMapping("getLoseByDept")
	@ResponseBody
	public EasyuiResult getLoseByDeptid(@RequestParam(required=true,value="deptId")Integer deptId){
		List<Lose> list = null;
		try{
			list = loseService.getLoseByDeptId(deptId);
		}catch(Exception e){
			e.printStackTrace();
			return new EasyuiResult(0L,null,false,"server error");
		}
		return new EasyuiResult(0L,list,true,"success");
	}
	/**
	 * 
	 * 根据id删除lose
	 */
	@RequestMapping("del")
	@ResponseBody
	public EasyuiResult delete(@RequestParam(value="id",required=true)Integer id){
		Integer ids  = 0;
		try {
			ids = loseService.deleteById(id);
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
	public EasyuiResult add(Lose lose){
		lose.setId(null);
		Integer ids=0;
		try {
			ids = loseService.add(lose);
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
	public EasyuiResult update(Lose lose){
		Integer ids=0;
		try {
			ids = loseService.updateLose(lose);
		} catch (Exception e) {
			e.printStackTrace();
			return new EasyuiResult(0L,null,false,"server error");
		}
		return new EasyuiResult(0L,ids,true,"success");
	}
}
