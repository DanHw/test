package com.doocker.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	//path.do?path=地址
	//html_path111.do
	@RequestMapping("{pathparams}")
	public String indexPage(
			//html_path111
			//@PathVariable 获取@RequestMapping中的占位符pathparams的值赋值给payh
			@PathVariable(value="pathparams")String path){
		//html/path111
		String replace=path.replace("_", "/");
		///WEB-INF/html/path111.jsp
		return replace;
	}
	
	//path.do?path=地址
	/*@RequestMapping("path")
	public String indexPage(String path){
		return path;
		
	}*/
	/*@RequestMapping("{pathparams}")
	public String indexPage(
			@PathVariable(value="pathparams")String path){
		return path;
	}*/
	
}
