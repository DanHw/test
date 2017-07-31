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
	<label>之前班级</label>
	<input id="iloseclazz" ><br>
	<label>流失原因</label>
	<input id="ireason" ><br>
	
	<label>操作日期</label>
	<input id="ilosetime" type="text" class="easyui-datebox" ></input>  <br>
	<label>经办人</label>
	<input id="ibywho" ><br>
	<label>是否退款</label>
	<input id="ibmoney" ><br>
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
			url:'lose/list.do',  
			//{"id":1,"deptName":"人力资源部","birthday":"2017-06-01","sex":1,"positionId":1,
				//"staffName":"张1","entry":"2017-06-01","positionName":"人力资源主管"}
		    columns:[[   
		        {field:'id',title:'编号',width:100},     
		        {field:'sname',title:'学生姓名',width:100},    
		        {field:'qq',title:'qq',width:100	},    
		        {field:'tel',title:'电话',width:100}, 
		        {field:'loseclazz',title:'之前班级',width:100}, 
		        {field:'reason',title:'流失原因',width:100},  
		        {field:'losetime',title:'操作日期',width:100},
		        {field:'bywho',title:'经办人',width:100},
		        {field:'bmoney',title:'是否退款',width:100},
		        
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
								var iloseclazz = $("#iloseclazz").val();
								var ireason = $("#ireason").val();
								var ilosetime = $("#ilosetime").datebox('getValue');
								var ibywho = $("#ibywho").val();
								var ibmoney = $("#ibmoney").val();
								$.ajax({
									url:'lose/add.do',
									data:{sname:isname,qq:iqq,tel:itel,loseclazz:iloseclazz,reason:ireason,losetime:ilosetime,bywho:ibywho,bmoney:ibmoney},
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
								$("#istudentName").val(row.studentName);
								$("#iqq").val(row.qq);
								$("#itel").val(row.tel);
								$("#iclazz").val(row.clazz);
								$("#icompany").val(row.company);
								$("#ijtime").val(row.jtime);
								$("#istation").val(row.station);
								$("#isal").val(row.sal);
								$("#isave").click(function(){
									var istudentName = $("#istudentName").val();
									var iqq = $("#iqq").val();
									var itel = $("#itel").val();
									var iclazz = $("#iclazz").val();
									var icompany = $("#icompany").val();
									var ijtime = $("#ijtime").datebox('getValue');
									var istation = $("#istation").val();
									var isal = $("#isal").val();
									if(isave){
										$.ajax({
											//修改部门的接口
											url:'lose/update.do',
											//饭送到职位的数据
											data:{id:row.id,studentName:istudentName,qq:iqq,tel:itel,clazz:iclazz,company:icompany,jtime:ijtime,station:istation,sal:isal},
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
									url:'lose/del.do',
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