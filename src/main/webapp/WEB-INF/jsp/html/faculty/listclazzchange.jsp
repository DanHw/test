<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<jsp:include page="/WEB-INF/jsp/lib.jsp"></jsp:include>
<div>
	<label>学生升留级</label>
	<input id="qstudentName" type="text">
	<input type="button" id="querystudentName" value="查询">
</div>
<!-- 创建easyui表格 -->
<table id="dg"></table>
<div id="addstaff">
	<label>学生名字</label>
	<input id="isname" ><br>
	<label>qq</label>
	<input id="iqq" ><br>
	<label>电话</label>
	<input id="itel" ><br>
	<label>升留级</label>
	<input id="iupdown" ><br>
	<label>之前班级</label>
	<input id="icbefore" ><br>
	<label>之后班级</label>
	<input id="icafter" ><br>
	<label>操作日期</label>
	<input id="ibytime" type="text" class="easyui-datebox" ></input>  <br>
	<label>经办人</label>
	<input id="ibywho" ><br>
	
	<input type="button" id= 'isave' value="保存">
</div>
<script type="text/javascript">
$(function(){
	
	$("#querystudentName").click(function(){
		var studentName = $("#qstudentName").val();
		$("#dg").datagrid({
			queryParams: {
				studentname:studentName
			}
		})
	})
	//初始化 表格
	$("#dg").datagrid({
			url:'clazzchange/list.do',  
			//{"id":1,"deptName":"人力资源部","birthday":"2017-06-01","sex":1,"positionId":1,
				//"staffName":"张1","entry":"2017-06-01","positionName":"人力资源主管"}
		    columns:[[   
		        {field:'id',title:'编号',width:100},     
		        {field:'sname',title:'学生姓名',width:100},    
		        {field:'qq',title:'qq',width:100	},    
		        {field:'tel',title:'电话',width:100}, 
		        {field:'cbefore',title:'之前班级',width:100}, 
		        {field:'cafter',title:'之后班级',width:100},
		        {field:'updown',title:'升留级',width:100},  
		        {field:'bytime',title:'操作日期',width:100},
		        {field:'bywho',title:'经办人',width:100},
		        
		    ]],
		    fit:true,
		    fitColumns:true,
		    singleSelect:true,
		    pagination:true,
		    toolbar:[{
		    			text:"增加",
						iconCls:'icon-add',
						handler:function(){
							$("#addstaff").dialog("open");
							//解除事件绑定
							$("#isave").unbind();
							//修改对话框标题
							$("#addstaff").dialog("setTitle","增加信息");
							//点击保存按钮 保存数据
							var row = $("#dg").datagrid("getSelected");
							$("#isave").click(function(){
								var isname = $("#isname").val();
								var iqq = $("#iqq").val();
								var itel = $("#itel").val();
								var icbefore = $("#icbefore").val();
								var icafter = $("#icafter").val();
								var ibytime = $("#ibytime").datebox('getValue');
								var ibywho = $("#ibywho").val();
								var iupdown = $("#iupdown").val();
								$.ajax({
									url:'clazzchange/add.do',
									data:{sname:isname,qq:iqq,tel:itel,cbefore:icbefore,cafter:icafter,bytime:ibytime,bywho:ibywho,updown:iupdown},
									success:function(data){
										if(data.flag){
											//重新加载（刷新）表格
											$("#dg").datagrid("reload");
											$("#addstaff").dialog("close");
										}
									}
								})
								
							});
						}
					},{
						text:"修改",
						iconCls:'icon-edit',
						handler:function(){
							//修改对话框的title标题
							$("#addstaff").dialog("setTitle","修改就业信息");
							$("#addstaff").dialog("open");
							//解除事件绑定
							$("#isave").unbind();
							//点击保存增加一个部门
							var row = $("#dg").datagrid("getSelected");
							if(row){
								$("#isname").val(row.sname);
								$("#iqq").val(row.qq);
								$("#itel").val(row.tel);
								$("#icbefore").val(row.cbefore);
								$("#icafter").val(row.cafter);
								$("#ibytime").val(row.bytime);
								$("#ibywho").val(row.bywho);
								$("#iupdown").val(row.updown);
								$("#isave").click(function(){
									var isname = $("#isname").val();
									var iqq = $("#iqq").val();
									var itel = $("#itel").val();
									var icbefore = $("#icbefore").val();
									var icafter = $("#icafter").val();
									var ibytime = $("#ibytime").datebox('getValue');
									var ibywho = $("#ibywho").val();
									var iupdown = $("#iupdown").val();
									if(isave){
										$.ajax({
											//修改部门的接口
											url:'clazzchange/update.do',
											//饭送到职位的数据
											data:{id:row.id,sname:isname,qq:iqq,tel:itel,cbefore:icbefore,cafter:icafter,bytime:ibytime,bywho:ibywho,updown:iupdown},
											//回调函数（请求响应回来后执行这个函数） data服务器相应的数据
											success:function(data){
												if(data.flag){
													//重新加载（刷新）表格
													$("#dg").datagrid("reload");
													$("#addstaff").dialog("close");
												}
											}
										})
									}
								})
							}
						}
					},{
						text:"删除",
						iconCls:'icon-remove',
						handler:function(){
							//获取选中的那一行数据 返回值
							//{"id":1,"deptName":"人力资源部","birthday":"2017-06-01","sex":1,"positionId":1,
							//"staffName":"张1","entry":"2017-06-01","positionName":"人力资源主管"}
							var row = $("#dg").datagrid("getSelected");
							//如果有选中的行就执行ajax
							if(row){
								$.ajax({
									//删除部门的接口
									url:'clazzchange/del.do',
									//饭送到借口的数据
									data:{id:row.id},
									//回调函数（请求响应回来后执行这个函数） data服务器相应的数据
									success:function(data){
										if(data.flag){
											//重新加载（刷新）表格
											$("#dg").datagrid("reload");
										}
									}
									
								})
							}
						}
					}]
	});
	
	$("#addstaff").dialog({
	    title: '增加信息',    
	    closed: true,    
	    cache: false,    
	    modal: true   
	})
})

</script>	