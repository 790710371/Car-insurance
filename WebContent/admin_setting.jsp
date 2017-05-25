<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>车险管理系统</title>
<meta name="description" content="管理员界面">
<meta name="keywords" content="index">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="assets/css/amazeui.min.css"/>
<link rel="stylesheet" href="assets/css/admin.css"/>
<link rel="stylesheet" href="layui/css/layui.css"/>
<script src="layui/layui.js"></script>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/app.js"></script>
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
  
</li>

 <li class="kuanjie">
 	
 </li>
    </ul>
  </div>
</header>

<div class="am-cf admin-main"> 

<div class="nav-navicon admin-main admin-sidebar">
    
    
    <div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;"> 欢迎系统管理员：<%=request.getParameter("usr_account") %></div>
    <div class="sideMenu">
      <h3 class="am-icon-flag"><em></em> <a href="#">会员管理</a></h3>
      <ul>
        <li><a href="usr_query.jsp">会员查询</a></li>
         <li><a href="add_usr.jsp">添加用户</a></li>
      </ul>
      <h3 class="am-icon-cart-plus on"><em></em> <a href="#">管理记录</a></h3>
      <ul>
          <li><a href="admin_record.jsp">操作记录</a></li>
          <li><a href="admin_setting.jsp">设置管理员</a></li>
      </ul>
     <h3 class="am-icon-users on"><em></em> <a href="#">商家功能</a></h3>
      <ul>
        <li><a href="usr_insure.jsp">投保修车 </a></li>
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


<div class="am-popup am-popup-inner" id="my-popup">
	
	    <div class="am-popup-hd">
      <h4 class="am-popup-title">添加商品一级分类</h4>
      <span data-am-modal-close
            class="am-close">&times;</span>
    </div>
	
	    <div class="am-popup-bd">
      

      <form class="am-form tjlanmu">


        <div class="am-form-group">
          <div class="zuo">栏目名称：</div>
          <div class="you">
            <input type="email" class="am-input-sm" id="doc-ipt-email-1" placeholder="请输入标题">
          </div>
        </div>
        <div class="am-form-group">
          <div class="zuo">栏目关键词：</div>
          <div class="you">
            <input type="password" class="am-input-sm" id="doc-ipt-pwd-1" placeholder="请输入关键词">
          </div>
        </div>
        <div class="am-form-group am-cf">
          <div class="zuo">栏目描述：</div>
          <div class="you">
            <textarea class="" rows="2" id="doc-ta-1"></textarea>
          </div>
        </div>
        <div class="am-form-group am-cf">
          <div class="zuo">栏目图片：</div>
          <div class="you" style="height: 45px;">
            <input type="file" id="doc-ipt-file-1">
            <p class="am-form-help">请选择要上传的文件...</p>
          </div>
        </div>
        <div class="am-form-group am-cf">
          <div class="zuo">简介：</div>
          <div class="you">
            <textarea class="" rows="2" id="doc-ta-1"></textarea>
          </div>
        </div>
        <div class="am-form-group am-cf">
        <div class="zuo">状态：</div>
        <div class="you" style="margin-top: 3px;">
          <label class="am-checkbox-inline">
            <input type="checkbox" value="option1">
            显示 </label>
          <label class="am-checkbox-inline">
            <input type="checkbox" value="option2">
            隐藏 </label>

            </div>
        </div>
        <div class="am-form-group am-cf">
          <div class="you">
            <p>
              <button type="submit" class="am-btn am-btn-success am-radius">提交</button>
            </p>
          </div>
        </div>
      </form>
    </div>
</div>
	<div class="am-popup am-popup-inner" id="my-popups">
	
	    <div class="am-popup-hd">
      <h4 class="am-popup-title">修改栏目名称</h4>
      <span data-am-modal-close
            class="am-close">&times;</span>
    </div>
	
	    <div class="am-popup-bd">
      

      <form class="am-form tjlanmu">


        <div class="am-form-group">
          <div class="zuo">栏目名称：</div>
          <div class="you">
            <input type="email" class="am-input-sm" id="doc-ipt-email-1" placeholder="请输入标题">
          </div>
        </div>
        <div class="am-form-group">
          <div class="zuo">栏目关键词：</div>
          <div class="you">
            <input type="password" class="am-input-sm" id="doc-ipt-pwd-1" placeholder="请输入关键词">
          </div>
        </div>
        <div class="am-form-group am-cf">
          <div class="zuo">栏目描述：</div>
          <div class="you">
            <textarea class="" rows="2" id="doc-ta-1"></textarea>
          </div>
        </div>
        <div class="am-form-group am-cf">
          <div class="zuo">栏目图片：</div>
          <div class="you" style="height: 45px;">
            <input type="file" id="doc-ipt-file-1">
            <p class="am-form-help">请选择要上传的文件...</p>
          </div>
        </div>
        <div class="am-form-group am-cf">
          <div class="zuo">简介：</div>
          <div class="you">
            <textarea class="" rows="2" id="doc-ta-1"></textarea>
          </div>
        </div>
        <div class="am-form-group am-cf">
        <div class="zuo">状态：</div>
        <div class="you" style="margin-top: 3px;">
          <label class="am-checkbox-inline">
            <input type="checkbox" value="option1">
            显示 </label>
          <label class="am-checkbox-inline">
            <input type="checkbox" value="option2">
            隐藏 </label>

            </div>
        </div>
        <div class="am-form-group am-cf">
          <div class="you">
            <p>
              <button type="submit" class="am-btn am-btn-success am-radius">提交</button>
            </p>
          </div>
        </div>
      </form>
    </div>
</div>
<div class="admin-biaogelist">
	
    <div class="listbiaoti am-cf">
      <ul class="am-icon-flag on"> 管理记录</ul>
      
      <dl class="am-icon-home" style="float: right;">当前位置： 管理记录 > <a href="#">设置管理员
      <!--这里打开的是新页面-->
    </div>
      <div class="tab_content_01">
      <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
  		<legend>您可以分配管理员职位方便更好地管理您的系统</legend>
	</fieldset>
<div style="margin-left: 50px">
<form class="layui-form layui-form-pane" action="">
		添加管理员:
    <div class="layui-input-inline">
      		<input id="ipt_name" type="text" name="username" lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input" >
    </div>
    <button  id="sub_ipt" class="layui-btn" lay-submit="" lay-filter="demo1">确定</button>
</form>
<table>
		<tr>
			<th>用户名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
			<th>职位&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
		</tr>
	</table>
</div>
      </div>
    </div>
 
 <div class="foods">
  <ul>
  </ul>
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



</body>
	<script>
		layui.use(['laypage', 'layer'], function() {
			var laypage = layui.laypage,
				layer = layui.layer;

			laypage({
				cont: 'operate_record',
				pages: 100,
				skip: true
			});
		});
	</script>
	//在此处进行提交
	<script type="text/javascript">
	$(document).ready(function(){
		$("#sub_ipt").click(function(){
			var usr_account =document.getElementById("ipt_name").value ;
			//接下来进行提交
			//获取XMLHTTPS
			var xmlHttps = ajaxHttpFunction(); 
			//此处采用get方法
			xmlHttps.open("get","/adm?action=SettingAdm&usr_account="+usr_account,true);
			
		});
	});
	
	function ajaxHttpFunction(){
		var xmlHttps ;
		try{
			xmlHttps = new XMLHttpRequest();
		}catch (e) {
			// 捕捉一下异常
			try{
			xmlHttps = new ActiveXObject("Msxm12.XMLHTTP");
			}catch (e) {
				xmlHttps = new ActiveXObject("Microsoft.XMLHTTP");
			}
		}
		return xmlHttps;
	}
	</script>
	<script>
	layui.use('submit(demo1)',function(data){
		layer.alert(JSON.stringify(data.field), {
		      title: '最终的提交信息'
		    })
	});
	</script>
</html>