<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title>用户信息详情界面</title>
		<link rel="stylesheet" type="text/css" href="css/details.css" />
		<link rel="stylesheet" href="layui/css/layui.css" type="text/css" />
		<link rel="stylesheet" href="css/common.css" />
		<link rel="stylesheet" href="css/admin.css" />
		<script src="js/jquery-1.12.0.min.js"></script>
		<script src="layui/layui.js"></script>
	</head>

	<body>
		<div id="container">
			<div class="title_nav">
				<div class="layui-nav" style="background-color: #23262E" lay-filter="">
					<img src="img/richanglogo168_24.png" style="margin-left: 10px;" />
					<li class="layui-nav-item">
						<a href="javascript:;">用户管理</a>
						<dl class="layui-nav-child">
							<!-- 二级菜单 -->
							<dd>
								<a href="Admin.html">用户管理</a>
							</dd>
							<!--<dd>
						<a href="">后台模版</a>
					</dd>
					<dd>
						<a href="">电商平台</a>
					</dd>-->
						</dl>
					</li>
					<li class="layui-nav-item">
						<a href="javascript:;">财务管理</a>
						<dl class="layui-nav-child">
							<!-- 二级菜单 -->
							<dd>
								<a href="">财务管理</a>
							</dd>
							<!--<dd>
						<a href="">后台模版</a>
					</dd>
					<dd>
						<a href="">电商平台</a>
					</dd>-->
						</dl>
					</li>
					<li class="layui-nav-item">
						<a href="javascript:;">账单管理</a>
						<dl class="layui-nav-child">
							<!-- 二级菜单 -->
							<dd>
								<a href="">账单管理</a>
							</dd>
							<!--<dd>
						<a href="">后台模版</a>
					</dd>
					<dd>
						<a href="">电商平台</a>
					</dd>-->
						</dl>
					</li>
					<div id="user_info_div">
						<p id="user_info">adds已登录&nbsp;>&nbsp;<a href="#" style="color: #fff;"/>注销</a></p>
					</div>
				</div>
			</div>
			<div class="content">
				<div class="content_left">
					<div class="form_info">
						<ul　class="list_ul">
							<li class="list_form_1">
								<img src="img/icon.png" width="100px" height="100px" style="margin-left: 20px;margin-top: 25px;">
								<div class="name">
									<span>&nbsp;&nbsp;adds
										</span>
								</div>

							</li>
							<li class="list_form_2">
								<span>姓名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;张三</span>
							</li>
							<li class="list_form_2">
								<span>手机号:&nbsp;&nbsp;&nbsp;&nbsp;1785654242</span>
							</li>
							<li class="list_form_2">
								<span>年龄:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;21</span>
							</li>
							<li class="list_form_2">
								<span>身份证:&nbsp;&nbsp;&nbsp;&nbsp;430426199511225654</span>
							</li>
							<li class="list_form_2">
								<span>车牌号:&nbsp;&nbsp;&nbsp;&nbsp;鲁x：45212</span>
							</li>
							<li class="list_form_2">
								<span>邮箱号:&nbsp;&nbsp;&nbsp;&nbsp;790710371@qq.com</span>
							</li>
							</ul>
					</div>
				</div>
				<div class="content_right">
					<div class="my_left_money">TA的余额</div>
					<div class="money_data">
						<div class="money_border">
							<p>5000元</p>
							<!--<button class="layui-btn layui-btn-radius layui-btn-primary">5000元</button>-->
						</div>
						<div class="money_border1">
							<button id="toubao" class="layui-btn layui-btn-big layui-btn-radius layui-btn-normal"><span>点击投保</span></button>
							<!--<p>点击投保</p>-->
						</div>
						<div class="money_border2">
							<button id="weihu" class="layui-btn layui-btn-big layui-btn-radius layui-btn-normal"><span>车辆维护</span></button>
							<!--<p>车辆维护</p>-->
						</div>
					</div>
				</div>
			</div>
			<div class="content_bottom">

			</div>
		</div>
		</div>
	</body>
	<script>
		layui.use('element', function() {
			var element = layui.element();

			//一些事件监听
			element.on('tab(demo)', function(data) {
				console.log(data);
			});
		});
	</script>
	<script>
		$("#toubao").click(function(){
			alert("hello world");
		})
		$("#weihu").bind("click",function(){
			alert("hello world1");
		})
	</script>

</html>