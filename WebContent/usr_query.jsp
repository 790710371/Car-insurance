<%@page import="com.safeCar.Bean.LoginInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
 response.setHeader("Pragma","No-cache");
 response.setHeader("Cache-Control","No-cache");
 response.setDateHeader("Expires", -1);
 response.setHeader("Cache-Control", "No-store");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>车险管理系统</title>
		<meta name="description" content="这是一个 index 页面">
		<meta name="keywords" content="index">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<meta name="renderer" content="webkit">
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<link rel="icon" type="image/png" href="assets/i/favicon.png">
		<link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
		<meta name="apple-mobile-web-app-title" content="Amaze UI" />
		<link rel="stylesheet" href="assets/css/amazeui.min.css" />
		<link rel="stylesheet" href="assets/css/admin.css" />
		<link rel="stylesheet" href="layui/css/layui.css" />
		<script src="assets/js/jquery.min.js"></script>
		<script src="assets/js/app.js"></script>
		<script src="layui/layui.js"></script>
		<script src="laypage/laypage/laypage.js"></script>
	</head>

	<body>
		<!--[if lte IE 9]><p class="browsehappy">升级你的浏览器吧！ <a href="http://se.360.cn/" target="_blank">升级浏览器</a>以获得更好的体验！</p><![endif]-->

		</head>

		<body>
			<header class="am-topbar admin-header">
				<div class="am-topbar-brand"><img src="assets/i/logo.png"></div>
				<div class="am-collapse am-topbar-collapse" id="topbar-collapse">

				</div>
			</header>
			<div class="am-cf admin-main">
				<div class="nav-navicon admin-main admin-sidebar">
					<div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;"> 欢迎系统管理员：
						<%=request.getParameter("usr_account")%> &nbsp;->
						<a href="LR?action=Logout"><p style="color:#aeb2b7 ">注销</p></a>
					</div>
					<div class="sideMenu">
						<h3 class="am-icon-users on"><em></em> <a href="#">用户管理</a></h3>
						<ul>
							<li>
								<a href="#">会员查询</a>
							</li>
							<li>
								<a href="add_usr.jsp">添加用户</a>
							</li>
						</ul>
						<h3 class="am-icon-cart-plus"><em></em> <a href="#"> 管理记录</a></h3>
						<ul>
							<li>
								<a href="admin_record.jsp">操作记录</a>
							</li>
							<li>
								<a href="admin_setting.jsp">设置管理员</a>
							</li>
						</ul>
						<h3 class="am-icon-flag"><em></em> <a href="#">商家功能</a></h3>
						<ul>
							<li>
								<a href="usr_insure.jsp">投保修车</a>
							</li>
							<li>
								<a href="insure_record.jsp">投保记录</a>
							</li>
							<li>
								<a href="check_record.jsp">修车记录</a>
							</li>
						</ul>
						<h3 class="am-icon-gears"><em></em> <a href="#">系统设置</a></h3>
						<ul>
							<li>数据备份</li>
							<li>邮件/短信管理</li>
							<li>上传/下载</li>
							<li>权限</li>
							<li>网站设置</li>
							<li>第三方支付</li>
							<li>提现 /转账 出入账汇率</li>
							<li>平台设置</li>
							<li>声音文件</li>
						</ul>
					</div>
					<!-- sideMenu End -->

					<script type="text/javascript">
						jQuery(".sideMenu").slide({
							titCell: "h3", //鼠标触发对象
							targetCell: "ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏
							effect: "slideDown", //targetCell下拉效果
							delayTime: 300, //效果时间
							triggerTime: 150, //鼠标延迟触发时间（默认150）
							defaultPlay: true, //默认是否执行效果（默认true）
							returnDefault: true //鼠标从.sideMen移走后返回默认状态（默认false）
						});
					</script>
				</div>
				<div class=" admin-content">
					<div class="daohang">
						<ul>
							<li>
								<button type="button" class="am-btn am-btn-default am-radius am-btn-xs">车险管理系统</button>

							</li>
						</ul>
					</div>

					<div class="admin-biaogelist">
						<div class="listbiaoti am-cf">
							<ul class="am-icon-flag on">
								会员查询
							</ul>
							<div style="margin-top: 2px;margin-right: 50px">
								<input style="width: 30%;display: inline;margin-left: 350px;" type="text" name="password" required lay-verify="required" placeholder="请输入用户姓名" autocomplete="off" class="layui-input">
								<button id="search" style="margin-left: 10px" class="layui-btn layui-btn-normal">搜索</button>
								<dl class="am-icon-home" style="float: right;">
									当前位置： 首页 >
									<a href="#">会员查询</a>
								</dl>
							</div>

							<!--data-am-modal="{target: '#my-popup'}" 弹出层 ID  弹出层 190行 开始  271行结束-->

						</div>
						<!-- 此处填写tab里面的内容 -->
						<div class="tab_content_01">
							<table class="layui-table">
								<colgroup>
									<col width="150">
									<col width="150">
									<col width="200">
									<col width="200">
								</colgroup>
								<thead>
									<tr>
										<th>用户名</th>
										<th>姓名</th>
										<th>邮箱</th>
										<th>手机号</th>
										<th>身份证</th>
										<th>车牌号</th>
									</tr>
								</thead>
								<tbody id="biuuu_city_list">

								</tbody>
							</table>
							<div id="page_query" style="text-align: center;"></div>
						</div>
					</div>
				</div>
			<script>
			$('.logout').click(function(){
				$.ajax({
					type:'POST',
					url:'LR',
					data:"action=Logout"
				});				
			});
			$('#search').click(function(){
				var name = $('.layui-input').val();
				if(name==''){
					alert('提示：搜索内容不能为空！！！');
					return;
					}
				var data ;
				$.ajax({
					type:'POST'
					,url:'adm'
					,data:"action=AdminQuery&usr_name="+name+"&page=1"
					,success:function(res){
					    data =  eval("("+res+")");
					    data = data.usr_info;
					    var nums = 5; //每页出现的数量
						var pages = Math.ceil(data.length/nums); //得到总页数

						var thisDate = function(curr){
						    var str = '', last = curr*nums - 1;
						    last = last >= data.length ? (data.length-1) : last;
						    for(var i = (curr*nums - nums); i <= last; i++){
						        str += '<tr>'+'<td>'+data[i].usr_account+'</td>'+'<td>'+data[i].usr_name+'</td>'+'<td>'+data[i].usr_email+'</td>'+'<td>'+data[i].usr_phone+'</td>'+'<td>'+data[i].usr_IDcard+'</td>'+'<td>'+data[i].usr_carID+'</td>'+'</tr>';
						    }
						    return str;
						};

						//调用分页
						laypage({
						    cont: 'page_query',
						    pages: pages,
						    jump: function(obj){
						        document.getElementById('biuuu_city_list').innerHTML = thisDate(obj.curr);
						    }
						})
					}
					,error:function(){
						alert("error");
					}
				});
	
				
			});
			

			</script>
		</body>

</html>