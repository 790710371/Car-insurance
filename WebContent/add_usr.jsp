<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<link rel="stylesheet" href="assets/css/admin.css"/>
		<link rel="stylesheet" href="layui/css/layui.css"/>
		<script src="assets/js/jquery.min.js"></script>
		<script src="assets/js/app.js"></script>
		<script src="layui/layui.js"></script>
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
					<div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;"> 欢迎系统管理员：<%=request.getSession().getAttribute("logininfo") %>&nbsp;-><a href="http://127.0.0.1:8001/mycar/LR.action?action=Logout" >注销</a></div>
					<div class="sideMenu">
						<h3 class="am-icon-users on"><em></em> <a href="#">用户管理</a></h3>
						<ul>
							<li>
								<a href="usr_query.jsp">会员查询</a>
							</li>
							<li>
								<a href="#">添加用户</a>
							</li>
						</ul>
						<h3 class="am-icon-cart-plus"><em></em> <a href="admin_record.jsp">管理记录</a></h3>
						<ul>
          <li><a href="admin_record.jsp">操作记录</a></li>
          <li><a href="admin_setting.jsp">设置管理员</a></li>
      </ul>
						  <h3 class="am-icon-flag"><em></em> <a href="#">商家管理</a></h3>
      <ul>
        <li><a href="usr_insure.jsp">投保修车</a> </li>
        <li><a href="insure_record.jsp">投保记录</a></li>
        <li><a href="check_record.jsp">修车记录</a></li>
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
								会员添加
							</ul>
							<dl class="am-icon-home" style="float: right;">
								当前位置： 首页 >
								<a href="#">添加用户</a>
							</dl>
		
							
							<!--data-am-modal="{target: '#my-popup'}" 弹出层 ID  弹出层 190行 开始  271行结束-->
							
						</div>
					<div class="tab_content_01">
<!-- 此处填写tab里面的内容 -->
					<div class="register">
		<div class="register_bar" style="margin-left: 100px">
			<form class="layui-form" action="<%=request.getContextPath()%>/LR?action=Register" method="post">
				<div class="layui-form-item">
					<label class="layui-form-label">用户名</label>
					<div class="layui-input-inline">
						<input type="text" name="usr_account" required lay-verify="required"
							placeholder="请输入用户名" autocomplete="off" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">密码</label>
					<div class="layui-input-inline">
						<input type="password" name="usr_pwd" required lay-verify="required"
							placeholder="请输入密码" autocomplete="off" class="layui-input">
					</div>
					<div class="layui-form-mid layui-word-aux">请输入以字母开头</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">邮箱</label>
					<div class="layui-input-inline">
						<input type="text" name="usr_email" required lay-verify="required"
							placeholder="请输入邮箱" autocomplete="off" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">姓名</label>
					<div class="layui-input-inline">
						<input type="text" name="usr_name" required lay-verify="required"
							placeholder="请输入姓名" autocomplete="off" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">身份证号码</label>
					<div class="layui-input-inline">
						<input type="text" name="usr_IDcard" required
							lay-verify="required" placeholder="请输入身份证号码" autocomplete="off"
							class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">车牌号</label>
					<div class="layui-input-inline">
						<input type="text" name="usr_carID" required lay-verify="required"
							placeholder="请输入车牌号" autocomplete="off" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">手机号</label>
					<div class="layui-input-inline">
						<input type="text" name="usr_phone" required lay-verify="required"
							placeholder="请输入手机号" autocomplete="off" class="layui-input">
					</div>
				</div>
			</form>
		</div>
		<div id="add_banner"><button id="submitForm" class="layui-btn" lay-submit
			lay-filter="formDemo">立即提交</button>
		<button type="reset" class="layui-btn layui-btn-primary">重置</button></div></div>
		
		
	</div>
	</div>
												
<div id="page_query" style="text-align: center;"></div> 

		</body>
<script type="text/javascript">
	$("#submitForm").click(function() {
		//alert("hello world");
		$("form").submit();
	})
</script>
<script>
	//Demo
	layui.use('form', function() {
		var form = layui.form();

		//监听提交
		form.on('submit(formDemo)', function(data) {
			layer.msg(JSON.stringify(data.field));
			return false;
		});
	});
</script>
</html>