<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
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
		<link rel="stylesheet" href="assets/css/admin.css">
		<link rel="stylesheet" href="layui/css/layui.css" />
		<script src="assets/js/jquery.min.js"></script>
		<script src="assets/js/app.js"></script>
	</head>

		<!--[if lte IE 9]><p class="browsehappy">升级你的浏览器吧！ <a href="http://se.360.cn/" target="_blank">升级浏览器</a>以获得更好的体验！</p><![endif]-->
		<body>
			<header class="am-topbar admin-header">
				<div class="am-topbar-brand"><img src="assets/i/logo.png"></div>

				<div class="am-collapse am-topbar-collapse" id="topbar-collapse">
					<ul class="am-nav am-nav-pills am-topbar-nav admin-header-list">
					</ul>
				</div>
			</header>

			<div class="am-cf admin-main">

				<div class="nav-navicon admin-main admin-sidebar">

					<div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;"> 欢迎系统管理员：清风抚雪</div>
					<div class="sideMenu">
						<h3 class="am-icon-flag"><em></em> <a href="#">商户管理</a></h3>
						<ul>
							<li>
								<a href="usr_query.jsp">会员查询</a>
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
						<h3 class="am-icon-users on"><em></em> <a href="#">商户功能</a></h3>
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
							<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs"> 车险管理系统</li>
						</ul>
					</div>
				</div>
			<div class="admin-biaogelist">

				<div class="listbiaoti am-cf">
					<ul class="am-icon-users"> 投保修车</ul>
					<dl class="am-icon-home" style="float: right;">当前位置： 首页 >
						<a href="#">用户投保</a>
					</dl>
					<div class="layui-input-inline" style="margin-top:3px;margin-left:50%">
						<input type="text" name="username" lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">
					</div>
					<button class="layui-btn layui-btn-normal" style="display: inline-block;margin-top:3px;margin-left:1.5%">搜索</button>
					<!--这里打开的是新页面-->
				</div>
				<div class="tab_content_01">
					<div class="layui-form">
						<table class="layui-table">
							<colgroup>
								<col width="100">
								<col width="200">
								<col width="150">
								<col width="100">
							</colgroup>
							<thead>
								<tr>
									<th>ID</th>
									<th>用户名</th>
									<th>姓名</th>
									<th>余额</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>1</td>
									<td>Mero</td>
									<td>李凤</td>
									<td>5000元
										<div class="layui-btn-group" style="margin-left:50px">
											<button class="layui-btn layui-btn-small"><i class="layui-icon"><img style="width: 18px;height:18px;margin-top:5px"src="img/insure.png"/></i></button>
											<button class="layui-btn layui-btn-small"><i class="layui-icon"><img style="width: 18px;height:18px;margin-top:5px"src="img/car_set.png"/></i></button>
										</div>
									</td>
								</tr>
								<tr>
									<td>2</td>
									<td>Alsa</td>
									<td>李凤</td>
									<td>5000元
										<div class="layui-btn-group" style="margin-left:50px">
											<button class="layui-btn layui-btn-small"><i class="layui-icon"><img style="width: 18px;height:18px;margin-top:5px"src="img/insure.png"/></i></button>
											<button class="layui-btn layui-btn-small"><i class="layui-icon"><img style="width: 18px;height:18px;margin-top:5px"src="img/car_set.png"/></i></button>
										</div>
									</td>
								</tr>
								<tr>
									<td>3</td>
									<td>Fsa</td>
									<td>李凤</td>
									<td>5000元
										<div class="layui-btn-group" style="margin-left:50px">
											<button class="layui-btn layui-btn-small"><i class="layui-icon"><img style="width: 18px;height:18px;margin-top:5px"src="img/insure.png"/></i></button>
											<button class="layui-btn layui-btn-small"><i class="layui-icon"><img style="width: 18px;height:18px;margin-top:5px"src="img/car_set.png"/></i></button>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				</br>
				<hr>
				<div class="usr_notice"><p style="display: inline-block;">注意：&nbsp;&nbsp;</p><button class="layui-btn layui-btn-small"><i class="layui-icon"><img style="width: 18px;height:18px;margin-top:5px"src="img/insure.png"/></i></button>代表投保；	<button class="layui-btn layui-btn-small"><i class="layui-icon"><img style="width: 18px;height:18px;margin-top:5px"src="img/car_set.png"/></i></button>代表修车</div>
			</div>

			</div>

			</div>

			<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]-->

			<!--[if (gte IE 9)|!(IE)]><!-->
			<script src="assets/js/amazeui.min.js"></script>
			<!--<![endif]-->

		</body>

</html>