<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<jsp:include page="/WEB-INF/jsp/lib.jsp"></jsp:include>
<div>
	<label>就业信息</label>
	<input id="qstudentName" type="text">
	<input type="button" id="querystudentName" value="查询">
</div>
<!-- 创建easyui表格 -->
<table id="dg"></table>
<div id="addstaff">
	<label>学生名字</label>
	<input id="istudentName" ><br>
	<label>qq</label>
	<input id="iqq" ><br>
	<label>电话</label>
	<input id="itel" ><br>
	<label>班级</label>
	<input id="iclazz" ><br>
	<label>就业公司</label>
	<input id="icompany" ><br>
	
	<label>入职日期</label>
	<input id="ijtime" type="text" class="easyui-datebox" ></input>  <br>
	<label>岗位</label>
	<input id="istation" ><br>
	<label>工资</label>
	<input id="isal" ><br>
	<input type="button" id= 'isave' value="保存">
</div>
<script type="text/javascript">
$(function(){
	
	$("#querystudentName").click(function(){
		var studentName = $("#qstudentName").val();
		$("#dg").datagrid({
			queryParams: {
				studentName:studentName
			}
		})
	})
	//获取所有的部门
	$.ajax({
		url:'jobz/list.do',
		data:{rows:100},
		success:function(data){
			if(data.rows){
				//清空append中的option
				$("#idept").empty();
				//data.rows数组 $(data.rows)标称jquery对象 jquery的方式迭代
				$(data.rows).each(function(){
					//this z指的是 rows里面每一条数据
					$("#idept").append('<option value='+this.id+'>'+this.deptName+'</option>')
				})
				//默认选择第一个的时候初始化第一个部门的职位选择框
				$.ajax({
					url:'jobz/getPositionByDept.do',
					data:{deptId:data.rows[0].id},
					success:function(data){
						$("#iposition").empty();
						//data.rows数组 $(data.rows)标称jquery对象 jquery的方式迭代
						$(data.rows).each(function(){
							//this z指的是 rows里面每一条数据
							$("#iposition").append('<option value='+this.id+'>'+this.positionName+'</option>')
						})
					}
				})
			}
			
		}
	})
	
	//当你改变部门的时候 职位也应该想改的改变 改变部门出发了select标签change事件
	$("#idept").change(function(){
		//获取最新的select值 选中的部门的id
		var deptid = $("#idept").val();
		$.ajax({
			url:'position/getPositionByDept.do',
			data:{deptId:deptid},
			success:function(data){
				$("#iposition").empty();
				//data.rows数组 $(data.rows)标称jquery对象 jquery的方式迭代
				$(data.rows).each(function(){
					//this z指的是 rows里面每一条数据
					$("#iposition").append('<option value='+this.id+'>'+this.positionName+'</option>')
				})
			}
		})
	})
	
	//初始化 表格
	$("#dg").datagrid({
			url:'jobz/list.do',  
			//{"id":1,"deptName":"人力资源部","birthday":"2017-06-01","sex":1,"positionId":1,
				//"staffName":"张1","entry":"2017-06-01","positionName":"人力资源主管"}
		    columns:[[    
		        {field:'id',title:'编号',width:100},    
		        {field:'studentName',title:'学生姓名',width:100},    
		        {field:'qq',title:'qq',width:100	},    
		        {field:'tel',title:'电话',width:100},    
		        {field:'clazz',title:'班级',width:100},    
		        {field:'company',title:'就业公司',width:100},    
		        {field:'jtime',title:'入职日期',width:100},
		        {field:'station',title:'岗位',width:100},
		        {field:'sal',title:'工资',width:100},
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
							$("#addstaff").dialog("setTitle","增加员工");
							//点击保存按钮 保存数据
							var row = $("#dg").datagrid("getSelected");
							$("#isave").click(function(){
								var istudentName = $("#istudentName").val();
								var iqq = $("#iqq").val();
								var itel = $("#itel").val();
								var iclazz = $("#iclazz").val();
								var icompany = $("#icompany").val();
								var ijtime = $("#ijtime").datebox('getValue');
								var istation = $("#istation").val();
								var isal = $("#sal").val();
								$.ajax({
									url:'jobz/add.do',
									data:{studentName:istudentName,qq:iqq,tel:itel,clazz:iclazz,company:icompany,jtime:ijtime,station:istation,sal:isal},
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
								$("#sal").val(row.sal);
								$("#isave").click(function(){
									var istudentName = $("#istudentName").val();
									var iqq = $("#iqq").val();
									var itel = $("#itel").val();
									var iclazz = $("#iclazz").val();
									var icompany = $("#icompany").val();
									var ijtime = $("#ijtime").datebox('getValue');
									var istation = $("#istation").val();
									var isal = $("#sal").val();
									if(isave){
										$.ajax({
											//修改部门的接口
											url:'jobz/update.do',
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
									url:'jobz/del.do',
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
	    title: '增加员工',    
	    closed: true,    
	    cache: false,    
	    modal: true   
	})
})

</script>	