package com.doocker.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doocker.crm.controller.common.EasyuiResult;
import com.doocker.crm.po.Position;
import com.doocker.crm.service.PositionService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("position")
public class PositionController {
	@Autowired
	private PositionService positionService;
	@RequestMapping("get")
	//返回的position转换为json
	@ResponseBody
	public Position getPosition(Integer id){
		return positionService.getPosition(id);
		
	}
	@RequestMapping("list")
	@ResponseBody
	public EasyuiResult listPosition(
			@RequestParam(value="positionname",required=false)String positionName,
			@RequestParam(value="page",defaultValue="1")Integer page,
			@RequestParam(value="rows",defaultValue="3")Integer rows
			){
		PageInfo<Position> list=new PageInfo<Position>();
		try{
			list=positionService.selectListByPage(positionName,page,rows);
		}catch(Exception e){e.printStackTrace();
		return new EasyuiResult(0L,null,false,"server error");
		}
		return new EasyuiResult(list.getTotal(),list.getList(),true,"success");
		
	}

	//getPositionByDeptId
	// 根据部门id查询改部门的职位
	@RequestMapping("getPositionByDept")
	@ResponseBody
	public EasyuiResult getPositionByDeptid(@RequestParam(required=true,value="deptId")Integer deptId){
		List<Position> list = null;
		try{
			list = positionService.getPositionByDeptId(deptId);
		}catch(Exception e){
			e.printStackTrace();
			return new EasyuiResult(0L,null,false,"server error");
		}
		return new EasyuiResult(0L,list,true,"success");
	}
	/**
	 * 
	 * 根据id删除position
	 */
	@RequestMapping("del")
	@ResponseBody
	public EasyuiResult delete(@RequestParam(value="id",required=true)Integer id){
		Integer ids  = 0;
		try {
			ids = positionService.deleteById(id);
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
	public EasyuiResult add(Position position){
		position.setId(null);
		Integer ids=0;
		try {
			ids = positionService.add(position);
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
	public EasyuiResult update(Position position){
		Integer ids=0;
		try {
			ids = positionService.updatePosition(position);
		} catch (Exception e) {
			e.printStackTrace();
			return new EasyuiResult(0L,null,false,"server error");
		}
		return new EasyuiResult(0L,ids,true,"success");
	}
}