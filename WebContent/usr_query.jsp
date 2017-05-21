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
						<h3 class="am-icon-flag"><em></em> <a href="#">用户管理</a></h3>
						<ul>
							<li>
								<a href="">会员查询</a>
							</li>
							<li>
								<a href="">添加用户</a>
							</li>
						</ul>
						<h3 class="am-icon-cart-plus"><em></em> <a href="#"> 管理记录</a></h3>
						<ul>
          <li><a href="">操作记录</a></li>
          <li><a href="">设置管理员</a></li>
      </ul>
						<h3 class="am-icon-volume-up"><em></em> <a href="#">信息通知</a></h3>
						<ul>
							<li>站内消息 /留言 </li>
							<li>短信</li>
							<li>邮件</li>
							<li>微信</li>
							<li>客服</li>
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
				<input style="width: 30%;display: inline;margin-left: 350px"" type="text" name="password" required lay-verify="required" placeholder="请输入用户姓名" autocomplete="off" class="layui-input">
							<button style="margin-left: 10px" class="layui-btn layui-btn-normal">搜索</button>
							<dl class="am-icon-home" style="float: right;">
								当前位置： 首页 >
								<a href="#">会员查询</a>
							</dl>
							</div>
							
							<!--data-am-modal="{target: '#my-popup'}" 弹出层 ID  弹出层 190行 开始  271行结束-->
							
						</div>
<!-- 此处填写tab里面的内容 -->
					<div class="tab_content">
												
						<table class="layui-table" lay-even="" lay-skin="nob">
  <colgroup>
    <col width="70">
    <col width="70">
    <col width="100">
    <col width="50">
    <col width="50">
    <col width="50">
    <col width="50">
  </colgroup>
  <thead>
    <tr>
      <th>用户名</th>
      <th>姓名</th>
      <th>邮箱</th>
      <th>手机号</th>
      <th>身份证</th>
      <th>车牌号</th>
      <th>删除用户</th>
    </tr> 
  </thead>
  <tbody>
    <tr>
      <td>Mero</td>
      <td>陈磊</td>
      <td>790710371@qq.com</td>
      <td>1826596263</td>
      <td>43042619903655</td>
      <td>鲁x：127891</td>
      <td><button class="layui-btn"><i class="layui-icon">&#xe640;</i></button></td>
    </tr>
     <tr>
      <td>Grow</td>
      <td>张贺</td>
      <td>45255223@qq.com</td>
      <td>16956332322</td>
      <td>420122355335624</td>
      <td>豫C：64231B</td>
      <td><button class="layui-btn"><i class="layui-icon">&#xe640;</i></button></td>
    </tr>
       <tr>
      <td>wolf</td>
      <td>陆志</td>
      <td>45255223@qq.com</td>
      <td>13645116328</td>
      <td>420365125635789</td>
      <td>粤A：968319</td>
      <td><button class="layui-btn"><i class="layui-icon">&#xe640;</i></button></td>
    </tr>
          <tr>
      <td>wolf</td>
      <td>陆志</td>
      <td>45255223@qq.com</td>
      <td>13645116328</td>
      <td>420365125635789</td>
      <td>粤A：968319</td>
      <td><button class="layui-btn"><i class="layui-icon">&#xe640;</i></button></td>
    </tr>
          <tr>
      <td>wolf</td>
      <td>陆志</td>
      <td>45255223@qq.com</td>
      <td>13645116328</td>
      <td>420365125635789</td>
      <td>粤A：968319</td>
      <td><button class="layui-btn"><i class="layui-icon">&#xe640;</i></button></td>
    </tr>
  </tbody>
</table>
<div id="page_query" style="text-align: center;"></div> 
</div>

	<script>
		layui.use(['laypage', 'layer'], function() {
			var laypage = layui.laypage,
				layer = layui.layer;

			laypage({
				cont: 'page_query',
				pages: 100,
				skip: true
			});
		});
	</script>

		</body>

</html>