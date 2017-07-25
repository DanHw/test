<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<jsp:include page="/WEB-INF/jsp/lib.jsp"></jsp:include>
<div>
	<label>职位名称</label>
	<input id="positionName" >
	<input id="queryPosition"type="button" value="查询">
</div>
<!-- 创建easyui表格 -->
<table id="dg"></table>

<!-- 表单窗口 -->
<div id="dlg">
	<form id="form1" action="#">
		<label>部门名称</label>
		<select id="ideptId">
		<option>aaaaa</option>
		</select>
		<label>职位名称</label>
		<input id="ipositionName" name="positionName">
		<input id="inderPosition"type="button" value="保存">
	</form>
</div>
<script type="text/javascript">
$(function(){
	//获取所有部门
	$.ajax({
		url:'dept/list.do',
		data:{rows:100},
		success:function(data){
			//console.log(data.rows);
			if(data.rows){
				$("#ideptId").empty();
				//data.rows数组$(data.rows)名称jQuery对象jQuery的方式迭代
				$(data.rows).each(function(){
					//this指的是rows里面的一条数据
					$("#ideptId").append('<option value='+this.id+'>'+this.deptName+'</option>')
				})
			}
		}
	})
	
	//点击查询按钮根据部门名称查询
	$("#queryPosition").click(function(){
		var positionName = $("#positionName").val();
		if(positionName){
			$('#dg').datagrid({
				queryParams: {
					positionname:positionName
				}
			});
		}
	})
	//初始化 表格
	$("#dg").datagrid({
			url:'position/list.do',    
		    columns:[[    
				{field:'deptName',title:'部门名称',width:100}, 
				{field:'positionName',title:'职位名称',width:100}   
		    ]],
		    fit:true,
		    fitColumns:true,
		    singleSelect:true,
		    pagination:true,
		    toolbar:[{
		    			text:"增加",
						iconCls:'icon-add',
						handler:function(){
							$("#ipositionName").val('');
							//修改对话框的title标题
							$("#dlg").dialog("setTitle","增加职位");
							$("#dlg").dialog("open");
							//保存按钮 解除所有的事件绑定
							$("#inderPosition").unbind();
							//点击保存增加一个部门
							$("#inderPosition").click(function(){
								//获取职位的名称
								var ipositionName = $("#ipositionName").val();
								var ideptId = $("#ideptId").val();
								if(ipositionName){
									$.ajax({
										//增加部门的接口
										url:'position/add.do',
										//饭送到借口的数据
										data:{deptId:ideptId,positionName:ipositionName},
										//回调函数（请求响应回来后执行这个函数） data服务器相应的数据
										success:function(data){
											if(data.flag){
												//重新加载（刷新）表格
												$("#dg").datagrid("reload");
												$("#dlg").dialog("close");
											}
										}	
									})
								}
							})
						}
					},{
						text:"修改",
						iconCls:'icon-edit',
						handler:function(){
							//修改对话框的title标题
							$("#dlg").dialog("setTitle","修改职位");
							$("#dlg").dialog("open");
							//保存按钮 解除所有的事件绑定
							$("#inderPosition").unbind();
							//点击保存增加一个部门
							var row = $("#dg").datagrid("getSelected");
							if(row){
								$("#ipositionName").val(row.positionName);
								$("#ideptId").val(row.deptId);
								$("#inderPosition").click(function(){
									var ipositionName = $("#ipositionName").val();
									var ideptId = $("#ideptId").val();
									if(ipositionName){
										$.ajax({
											//修改部门的接口
											url:'position/update.do',
											//饭送到职位的数据
											data:{id:row.id,positionName:ipositionName,deptId:ideptId},
											//回调函数（请求响应回来后执行这个函数） data服务器相应的数据
											success:function(data){
												if(data.flag){
													//重新加载（刷新）表格
													$("#dg").datagrid("reload");
													$("#dlg").dialog("close");
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
							//获取选中的那一行数据 返回值 {"id":1,"positionName":"人力资源部"}
							var row = $("#dg").datagrid("getSelected");
							//如果有选中的行就执行ajax
							if(row){
								$.ajax({
									//删除部门的接口
									url:'position/del.do',
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
	//初始化表单窗口
	
	$('#dlg').dialog({    
	    title: '增加部门',    
	    closed: true,    
	    cache: false,    
	    modal: true   
	});   
})

</script>	