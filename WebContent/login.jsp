<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en" class="no-js">

	<head>

		<meta charset="utf-8">
		<title>欢迎登陆</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<meta name="author" content="">

		<!--  CSS  -->
		<link rel="stylesheet" href="css/reset.css">
		<link rel="stylesheet" href="css/supersized.css">
		<link rel="stylesheet" href="css/style.css">

	</head>

	<body oncontextmenu="return false">
		<div class="page-container">
			<h1>欢迎登陆</h1>
			<form id="loginform" action="<%=request.getContextPath()%>/LR?action=Login" method="post" commandName="user">
				<div>
					<input type="text" name="usr_account" class="username" placeholder="用户名" autocomplete="off" />
				</div>
				<div>
					<input type="password" name="usr_pwd" class="password" placeholder="密码" oncontextmenu="return false" onpaste="return false" />
				</div>
				<div>
					<button id="submit1" type="button">登录</button>
					<a href="#" class="zhuce" id="submit" type="button">用户注册</a>
				</div>
			</form>
			<div class="connect">
				<p>递交一份车险，还你一份保障</p>
			</div>
		</div>
		<div class="alert" style="display: none">
			<h2>消息</h2>
			<div class="alert_con">
				<p id="ts"></p>
				<p style="line-height: 70px">
					<a class="btn">确定</a>
				</p>
			</div>
		</div>

		<script src="http://apps.bdimg.com/libs/jquery/1.6.4/jquery.min.js" type="text/javascript"></script>
		<script src="js/supersized.3.2.7.min.js" type="text/javascript"></script>
		<script src="js/supersized-init.js" type="text/javascript"></script>
		<script type="text/javascript">
			$(".zhuce").click(function () {
				window.location.href = "register.jsp";
			})
		</script>
		<script type="text/javascript">
			$(".btn").click(function() {
				is_hide();
			})
			var u = $("input[name=username]");
			var p = $("input[name=password]");
			$("#submit1").live('click', function() {
				if(u.val() == '' || p.val() == '') {
					$("#ts").html("用户名或密码不能为空~");
					is_show();
					return false;
				} else {
					var reg = /^[0-9A-Za-z]+$/;
					if(!reg.exec(u.val())) {
						$("#ts").html("用户名错误");
						is_show();
						return false;
					} else {
						$("#loginform").submit();
					}

				}
			});
			window.onload = function() {
				$(".connect p").eq(0).animate({
					"left": "0%"
				}, 600);
				$(".connect p").eq(1).animate({
					"left": "0%"
				}, 400);
			}

			function is_hide() {
				$(".alert").animate({
					"top": "-40%"
				}, 300)
			}

			function is_show() {
				$(".alert").show().animate({
					"top": "45%"
				}, 300)
			}
		</script>
	</body>

</html>