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
<link rel="stylesheet" href="assets/css/amazeui.min.css"/>
<link rel="stylesheet" href="assets/css/admin.css">
<link rel="stylesheet" href="layui/css/layui.css" />
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
    <ul class="am-nav am-nav-pills am-topbar-nav admin-header-list">

   <li class="am-dropdown tognzhi" data-am-dropdown>
  <ul class="am-dropdown-content">
  </ul>
</li>
    </ul>
  </div>
</header>

<div class="am-cf admin-main"> 

<div class="nav-navicon admin-main admin-sidebar">
    
    
    <div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;"> 欢迎系统管理员：清风抚雪</div>
    <div class="sideMenu">
      <h3 class="am-icon-flag"><em></em> <a href="#">会员管理</a></h3>
        <ul>
        <li><a href="usr_query.jsp">会员查询</a></li>
         <li><a href="add_usr.jsp">添加用户</a></li>
      </ul>
      <h3 class="am-icon-cart-plus"><em></em> <a href="#"> 管理记录</a></h3>
     <ul>
          <li><a href="admin_record.jsp">操作记录</a></li>
          <li><a href="admin_setting.jsp">设置管理员</a></li>
      </ul>
      <h3 class="am-icon-users on"><em></em> <a href="#">商家功能</a></h3>
      <ul>
        <li> <a href="usr_insure.jsp">投保修车</a> </li>
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
				titCell:"h3", //鼠标触发对象
				targetCell:"ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏
				effect:"slideDown", //targetCell下拉效果
				delayTime:300 , //效果时间
				triggerTime:150, //鼠标延迟触发时间（默认150）
				defaultPlay:true,//默认是否执行效果（默认true）
				returnDefault:true //鼠标从.sideMen移走后返回默认状态（默认false）
				});
		</script> 

    
    
    
    
    
    
    
</div>

<div class=" admin-content">
	
		<div class="daohang">
			<ul>
				<li><button type="button" class="am-btn am-btn-default am-radius am-btn-xs"> 车险管理系统 </li>
				
				
			</ul>

       

	
</div>


	
	
	
	
	
	
	
	
	


<div class="admin-biaogelist">
	
    <div class="listbiaoti am-cf">
      <ul class="am-icon-users">修车记录</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">修车记录</a></dl>
      <!--这里打开的是新页面-->

    </div>
    <div class="tab_content_01">
    		<div class="query_insure_record">
						 <div class="layui-inline" style="margin-left:50px;margin-top:20px;width:400px">
						 <div class="layui-input-inline">
						 <label class="layui-form-label">关键字:</label>
      <input type="text" name="username" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input" style="display: inline-block;width: 200px">
    </div>
						 </br>
      <label class="layui-form-label" style="margin-top:10px">请输入:</label>
      <div class="layui-input-inline" style="margin-top:5px;display: inline-block;margin-top: 15px">
        <select name="modules" lay-verify="required" lay-search="">
          <option value="">选择类型</option>
          <option value="1">用户名</option>
          <option value="2">邮箱</option>
          <option value="3">姓名</option>
          <option value="4">手机号</option>
          <option value="5">身份证</option>
          <option value="6">车牌号</option>
    
        </select>
      </div>
    </div>
			<button class="layui-btn layui-btn-normal" style="margin-left:50px；margin-top:10px">搜索</button>
				</div>
				<hr>
				<!-- 这里是查询的表格 -->
					<div class="layui-form">
						<table class="layui-table">
							<colgroup>
								<col width="90">
								<col width="150">
								<col width="150">
								<col width="100">
							</colgroup>
							<thead>
								<tr>
									<th>用户名</th>
									<th>姓名</th>
									<th>修车日期</th>
									<th>用户余额</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>Mero</td>
									<td>李凤</td>
									<td>2017-05-24</td>
									<td>0元</td>
								</tr>
								</tr>
							</tbody>
						</table>
					</div>
					<!-- 分页 -->
					<div id="page_query" style="text-align: center;"></div> 
				</div>
    </div>
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