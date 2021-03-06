<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>应用实例</title>
<jsp:include page="/WEB-INF/jsp/lib.jsp"></jsp:include>
<script type="text/javascript" src='js/outlook2.js'></script>
<script type="text/javascript">
	var _menus = {
		"menus" : [ {
			"menuid" : "1",
			"icon" : "icon-sys",
			"menuname" : "系统管理",
			"menus" : [ {
				"menuid" : "11",
				"menuname" : "用户管理",
				"icon" : "icon-users",
				"url" : "demo2.html"
			}, {
				"menuid" : "12",
				"menuname" : "角色管理",
				"icon" : "icon-role",
				"url" : "demo2.html"
			}, {
				"menuid" : "13",
				"menuname" : "权限设置",
				"icon" : "icon-set",
				"url" : "demo.html"
			}, {
				"menuid" : "14",
				"menuname" : "系统日志",
				"icon" : "icon-log",
				"url" : "demo1.html"
			} ]
		}, {
			"menuid" : "2",
			"icon" : "icon-sys",
			"menuname" : "咨询部",
			"menus" : [ {
				"menuid" : "21",
				"menuname" : "咨询学生管理",
				"icon" : "icon-nav",
				"url" : "html/employee/listEmployee.html"
			}, {
				"menuid" : "22",
				"menuname" : "咨询学生跟踪",
				"icon" : "icon-nav",
				"url" : "html/user/listUser.html"
			}, {
				"menuid" : "23",
				"menuname" : "学生移交",
				"icon" : "icon-nav",
				"url" : "html/remove/listRemove.html"
			}, {
				"menuid" : "24",
				"menuname" : "移交历史",
				"icon" : "icon-nav",
				"url" : "html/remove/historyRemove.html"
			}, ]
		}, {
			"menuid" : "3",
			"icon" : "icon-sys",
			"menuname" : "学工部",
			"menus" : [ {
				"menuid" : "31",
				"menuname" : "在校学生管理",
				"icon" : "icon-nav",
				"url" : "html_faculty_liststudent.do"
			}, {
				"menuid" : "32",
				"menuname" : "学生升/留级",
				"icon" : "icon-nav",
				"url" : "html_faculty_listclazzchange.do"
			}, {
				"menuid" : "33",
				"menuname" : "学生流失情况",
				"icon" : "icon-nav",
				"url" : "html_faculty_listlose.do"
			}, ]
		}, {
			"menuid" : "4",
			"icon" : "icon-sys",
			"menuname" : "教学部",
			"menus" : [ {
				"menuid" : "41",
				"menuname" : "班级管理",
				"icon" : "icon-nav",
				"url" : "html/lesson/listLesson.html"
			}, {
				"menuid" : "42",
				"menuname" : "课程类型",
				"icon" : "icon-nav",
				"url" : "html/lesson/listLesson.html"
			} ]
		}, {
			"menuid" : "5",
			"icon" : "icon-sys",
			"menuname" : "就业部",
			"menus" : [ {
				"menuid" : "51",
				"menuname" : "就业情况",
				"icon" : "icon-nav",
				"url" : "html_job_listjobz.do"
			} ]
		}, {
			"menuid" : "6",
			"icon" : "icon-sys",
			"menuname" : "人力资源部门",
			"menus" : [ {
				"menuid" : "61",
				"menuname" : "部门管理",
				"icon" : "icon-nav",
				"url" : "html_hr_listdept.do"
			}, {
				"menuid" : "62",
				"menuname" : "职务管理",
				"icon" : "icon-nav",
				"url" : "html_hr_listposition.do"
			}, {
				"menuid" : "63",
				"menuname" : "员工管理",
				"icon" : "icon-nav",
				"url" : "html_hr_liststaff.do"
			} ]
		} ]
	};
	//设置登录窗口
	function openPwd() {
		$('#w').window({
			title : '修改密码',
			width : 300,
			modal : true,
			shadow : true,
			closed : true,
			height : 160,
			resizable : false
		});
	}
	//关闭登录窗口
	function closePwd() {
		$('#w').window('close');
	}

	//修改密码
	function serverLogin() {
		var $newpass = $('#txtNewPass');
		var $rePass = $('#txtRePass');

		if ($newpass.val() == '') {
			msgShow('系统提示', '请输入密码！', 'warning');
			return false;
		}
		if ($rePass.val() == '') {
			msgShow('系统提示', '请在一次输入密码！', 'warning');
			return false;
		}

		if ($newpass.val() != $rePass.val()) {
			msgShow('系统提示', '两次密码不一至！请重新输入', 'warning');
			return false;
		}

		$.post('/ajax/editpassword.ashx?newpass=' + $newpass.val(), function(
				msg) {
			msgShow('系统提示', '恭喜，密码修改成功！<br>您的新密码为：' + msg, 'info');
			$newpass.val('');
			$rePass.val('');
			close();
		})

	}

	$(function() {

		openPwd();

		$('#editpass').click(function() {
			$('#w').window('open');
		});

		$('#btnEp').click(function() {
			serverLogin();
		})

		$('#btnCancel').click(function() {
			closePwd();
		})

		$('#loginOut').click(function() {
			$.messager.confirm('系统提示', '您确定要退出本次登录吗?', function(r) {

				if (r) {
					location.href = '/ajax/loginout.ashx';
				}
			});
		})
	});
</script>
</head>
<body class="easyui-layout" style="overflow-y: hidden" scroll="no">
	<div region="north" split="true" border="false"
		style="overflow: hidden; height: 30px; background: url(images/layout-browser-hd-bg.gif) #7f99be repeat-x center 50%; line-height: 20px; color: #fff; font-family: Verdana, 微软雅黑, 黑体">
		<span style="float: right; padding-right: 20px;" class="head">
			欢迎<a href="#" id="editpass">修改密码</a> <a href="#" id="loginOut">安全退出</a>
		</span> <span style="padding-left: 10px; font-size: 16px;"> <img
			src="images/blocks.gif" width="20" height="20" align="absmiddle" />
			应用实例
		</span>
	</div>
	<div region="south" split="true"
		style="height: 30px; background: #D2E0F2;"></div>
	<div region="west" hide="true" split="true" title="导航菜单"
		style="width: 180px;" id="west">
		<div id="nav" class="easyui-accordion" fit="true" border="false">
			<!--  导航内容 -->

		</div>
	</div>
	<div id="mainPanle" region="center"
		style="background: #eee; overflow-y: hidden">
		<div id="tabs" class="easyui-tabs" fit="true" border="false">
			<div title="欢迎使用"
				style="padding: 20px; overflow: hidden; color: red;"></div>
		</div>
	</div>


	<!--修改密码窗口-->
	<div id="w" class="easyui-window" title="修改密码" collapsible="false"
		minimizable="false" maximizable="false" icon="icon-save"
		style="width: 300px; height: 150px; padding: 5px; background: #fafafa;">
		<div class="easyui-layout" fit="true">
			<div region="center" border="false"
				style="padding: 10px; background: #fff; border: 1px solid #ccc;">
				<table cellpadding=3>
					<tr>
						<td>新密码：</td>
						<td><input id="txtNewPass" type="password" class="txt01" /></td>
					</tr>
					<tr>
						<td>确认密码：</td>
						<td><input id="txtRePass" type="password" class="txt01" /></td>
					</tr>
				</table>
			</div>
			<div region="south" border="false"
				style="text-align: right; height: 30px; line-height: 30px;">
				<a id="btnEp" class="easyui-linkbutton" icon="icon-ok"
					href="javascript:void(0)"> 确定</a> <a id="btnCancel"
					class="easyui-linkbutton" icon="icon-cancel"
					href="javascript:void(0)">取消</a>
			</div>
		</div>
	</div>

	<div id="mm" class="easyui-menu" style="width: 150px;">
		<div id="mm-tabupdate">刷新</div>
		<div class="menu-sep"></div>
		<div id="mm-tabclose">关闭</div>
		<div id="mm-tabcloseall">全部关闭</div>
		<div id="mm-tabcloseother">除此之外全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-tabcloseright">当前页右侧全部关闭</div>
		<div id="mm-tabcloseleft">当前页左侧全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-exit">退出</div>
	</div>
</body>
</html>