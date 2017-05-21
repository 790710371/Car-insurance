<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>用户注册页面</title>
<link rel="stylesheet" href="layui/css/layui.css" type="text/css" />
<link rel="stylesheet" href="css/register.css" />
<script src="js/jquery-1.12.0.min.js"></script>
<script src="layui/layui.js"></script>
</head>

<body>
	<div class="register">
		<h1>用户注册</h1>
		<div class="register_bar">
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
		<button id="submitForm" class="layui-btn" lay-submit
			lay-filter="formDemo">立即提交</button>
		<button type="reset" class="layui-btn layui-btn-primary">重置</button>
	</div>

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