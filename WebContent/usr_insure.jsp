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
		<script src="laypage/laypage/laypage.js"></script>
		<script src="layer-v3.0.3/layer/layer.js"></script>
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

					<div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;"> 欢迎系统管理员：Mero</div>
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
						<input type="text" name="username" lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input"/>
					</div>
					<button onclick="search()" class="layui-btn layui-btn-normal" style="display: inline-block;margin-top:3px;margin-left:1.5%">搜索</button>
					<!--这里打开的是新页面-->
				</div>
				<div class="tab_content_01">
					<div class="layui-form">
						<table class="layui-table">
							<colgroup>
								<col width="100">
								<col width="200">
								<col width="150">
								<col width="150">
							</colgroup>
							<thead>
								<tr>
									<th>ID</th>
									<th>用户名</th>
									<th>姓名</th>
									<th>余额</th>
								</tr>
							</thead>
							<tbody id="biuuu_city_list">
								
							</tbody>
						</table>
					</div>
							<div id="page_query" style="text-align: center;"></div>
				</div>
				</br>
				<hr>
				<div class="usr_notice"><p style="display: inline-block;">注意：&nbsp;&nbsp;</p><button class="layui-btn layui-btn-small"><i class="layui-icon"><img style="width: 18px;height:18px;margin-top:5px"src="img/insure.png"/></i></button>&nbsp;投保；	<button class="layui-btn layui-btn-small"><i class="layui-icon"><img style="width: 18px;height:18px;margin-top:5px"src="img/car_set.png"/></i></button>&nbsp;修车；<button class="layui-btn layui-btn-small"><i class="layui-icon"><img style="width: 18px;height:18px;margin-top:5px"src="img/recharge.png"/></i></button>&nbsp;充值；</div>
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
			function search(){
				var s_name =$('.layui-input').val();
				if(s_name==''){
					alert('提示：搜索内容不能为空！！！');
					return;
				}
				var data ;
				$.ajax(
				{
					type:'POST'
					,url:'adm.action'
					,data:"action=AdminQueryInsure&usr_name="+s_name
					,success:function(res){
						 data =  eval("("+res+")");
						    data = data.usr_info;
						    var nums = 5; //每页出现的数量
							var pages = Math.ceil(data.length/nums); //得到总页数

							var thisDate = function(curr){
							    var str = '', last = curr*nums - 1;
							    last = last >= data.length ? (data.length-1) : last;
							    for(var i = (curr*nums - nums); i <= last; i++){
							        str += '<tr>'+'<td>'+data[i].id+'</td>'+'<td>'+data[i].usr_account+'</td>'+'<td>'+data[i].usr_name+'</td>'+'<td><div style="width:100px;height:25px;display:inline-block;color:red" class="yuan">'+data[i].usr_cash+'元</div>'+'<div style="display:inline" id="btn_group"><button data-method="notice" id="btn_01" style="margin-left:5px;" class="layui-btn layui-btn-small"><i class="layui-icon"><img style="width: 18px;height:18px;margin-top:5px" src="img/insure.png"/></i></button><button id="btn_02" class="layui-btn layui-btn-small"><i class="layui-icon"><img style="width: 18px;height:18px;margin-top:5px" src="img/car_set.png"/></i></button>'+'<button id="btn_03" style="margin-left:10px" class="layui-btn layui-btn-small"><i class="layui-icon"><img style="width: 18px;height:18px;margin-top:5px" src="img/recharge.png"/></i></button></div>'+'</td>'+'</tr>';
							    }
							    return str;
							};

							//调用分页
							laypage({
							    cont: 'page_query',
							    pages: pages,
							    skin: '#009688',
							    jump: function(obj){
							        document.getElementById('biuuu_city_list').innerHTML = thisDate(obj.curr);
							        	
							        
							        
							        	  $('#biuuu_city_list tr').eq(0).find('#btn_group').on('click','#btn_01',function(){
							        		//示范一个公告层
							        		  layer.open({
							        		    type: 1
							        		    ,title: '温馨提示' //不显示标题栏
							        		    ,closeBtn: false
							        		    ,area: '300px;'
							        		    ,shade: 0.3
							        		    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
							        		    ,resize: false
							        		    ,btn: ['确定投保', '取消']
							        		    ,btnAlign: 'c'
							        		    ,moveType: 1 //拖拽模式，0或者1
							        		    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">欢迎使用本系统，<br>正在提示你是否选择投保，如果需要投保请点击下面的确定按钮<br>不需要则点击取消！</div>'
							        		    ,success: function(layero){
							        		      $(".layui-layer-btn0").click(function(){
							        		    	  $.ajax({
															type:'POST'
																,url:'adm.action'
																,data:"action=Insure&usr_account="+data[nums*(obj.curr-1)].usr_account
																,success:function(res){
																	var s0_x = eval("("+res+")");
																	layer.open({
																		  type: 1
																		  ,offset: '250px' //具体配置参考：offset参数项
																		  ,content: '<div style="padding: 20px 80px;">'+s0_x.message+'</div>'
																		  ,btn: '关闭全部'
																		  ,btnAlign: 'c' //按钮居中
																		  ,shade: 0 //不显示遮罩
																		  ,yes: function(){
																			  $.ajax(
																						{
																							type:'POST'
																							,url:'adm.action'
																							,data:"action=QueryCash&usr_account="+data[nums*(obj.curr-1)].usr_account
																							,success:function(res){
																								var s0_x = eval("("+res+")");
																								var cash = s0_x.usr_cash;
																								 $('.yuan').eq(0).html(cash+'元');
																							}
																						,error:function(res){
																							
																						}
																						});
																		   		 layer.closeAll();
																		  }
																		});
																}
																,error:function(res){
																	alert("无法连接服务器");
																}
														});
							        		      });
							        		    }
							        		  });
							        		 
											});
							        			
							        	  
							        	  
							        	  
							        	  
							        	  $('#biuuu_city_list tr').eq(0).find('#btn_group').on('click','#btn_02',function(){
							        		//示范一个公告层
							        		  layer.open({
							        		    type: 1
							        		    ,title: '温馨提示' //不显示标题栏
							        		    ,closeBtn: false
							        		    ,area: '300px;'
							        		    ,shade: 0.3
							        		    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
							        		    ,resize: false
							        		    ,btn: ['确定修车', '取消']
							        		    ,btnAlign: 'c'
							        		    ,moveType: 1 //拖拽模式，0或者1
							        		    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">欢迎使用本系统，<br>正在提示你是否选择修车，如果需要修车请点击下面的确定按钮<br>不需要则点击取消！</div>'
							        		    ,success: function(layero){
							        		      $(".layui-layer-btn0").click(function(){
							        		    	  $.ajax({
															type:'POST'
																,url:'adm.action'
																,data:"action=Fix&usr_account="+data[nums*(obj.curr-1)].usr_account
																,success:function(res){
																	var s0_x = eval("("+res+")");
																	layer.open({
																		  type: 1
																		  ,offset: '250px' //具体配置参考：offset参数项
																		  ,content: '<div style="padding: 20px 80px;">'+s0_x.message+'</div>'
																		  ,btn: '关闭全部'
																		  ,btnAlign: 'c' //按钮居中
																		  ,shade: 0 //不显示遮罩
																		  ,yes: function(){
																			  $.ajax(
																						{
																							type:'POST'
																							,url:'adm.action'
																							,data:"action=QueryCash&usr_account="+data[nums*(obj.curr-1)].usr_account
																							,success:function(res){
																								var s0_x = eval("("+res+")");
																								var cash = s0_x.usr_cash;
																								 $('.yuan').eq(0).html(cash+'元');
																							}
																						,error:function(res){
																							
																						}
																						});
																		   		 layer.closeAll();
																		  }
																		});
																}
																,error:function(res){
																	alert("无法连接服务器");
																}
														});
							        		      });
							        		    }
							        		  });
											});
							        	  $('#biuuu_city_list tr').eq(0).find('#btn_group').on('click','#btn_03',function(){
							        		  layer.open({
							        		    type: 1
							        		    ,title: '温馨提示' //不显示标题栏
							        		    ,closeBtn: false
							        		    ,area: '300px;'
							        		    ,shade: 0.3
							        		    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
							        		    ,resize: false
							        		    ,btn: ['确定充值', '取消']
							        		    ,btnAlign: 'c'
							        		    ,moveType: 1 //拖拽模式，0或者1
							        		    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">欢迎使用本系统,<br>正在提示你是否选择充值<br>需要充值请点击下面的确定按钮<br><br><input id="recharge" style="color:#000" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入充值金额" class="layui-input"></div>'
							        		    ,success: function(layero){
							        		      $(".layui-layer-btn0").click(function(){
							        		    	  var usr_cash = $('#recharge').val();
							        		    	  $.ajax({
															type:'POST'
																,url:'adm.action'
																,data:"action=Recharge&usr_account="+data[nums*(obj.curr-1)].usr_account+'&usr_cash='+usr_cash
																,success:function(res){
																	var s0_x = eval("("+res+")");
																	layer.open({
																		  type: 1
																		  ,offset: '250px' //具体配置参考：offset参数项
																		  ,content: '<div style="padding: 20px 80px;">'+s0_x.message+'</div>'
																		  ,btn: '关闭全部'
																		  ,btnAlign: 'c' //按钮居中
																		  ,shade: 0 //不显示遮罩
																		  ,yes: function(){
																				$.ajax(
																						{
																							type:'POST'
																							,url:'adm.action'
																							,data:"action=QueryCash&usr_account="+data[nums*(obj.curr-1)].usr_account
																							,success:function(res){
																								var s0_x = eval("("+res+")");
																								var cash = s0_x.usr_cash;
																								 $('.yuan').eq(0).html(cash+'元');
																							}
																						,error:function(res){
																							
																						}
																						});
																		   		 layer.closeAll();
																		  	}
																		});
																}
																,error:function(res){
																	alert("无法连接服务器");
																}
														});
							        		      });
							        		     
							        		    }
							        		  });
											});
							        	  
							        	  $('#biuuu_city_list tr').eq(1).find('#btn_group').on('click','#btn_01',function(){
							        		//示范一个公告层
							        		  layer.open({
							        		    type: 1
							        		    ,title: '温馨提示' //不显示标题栏
							        		    ,closeBtn: false
							        		    ,area: '300px;'
							        		    ,shade: 0.3
							        		    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
							        		    ,resize: false
							        		    ,btn: ['确定投保', '取消']
							        		    ,btnAlign: 'c'
							        		    ,moveType: 1 //拖拽模式，0或者1
							        		    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">欢迎使用本系统，<br>正在提示你是否选择投保，如果需要投保请点击下面的确定按钮<br>不需要则点击取消！</div>'
							        		    ,success: function(layero){
							        		      $(".layui-layer-btn0").click(function(){
							        		    	  $.ajax({
															type:'POST'
																,url:'adm.action'
																,data:"action=Insure&usr_account="+data[nums*(obj.curr-1)+1].usr_account
																,success:function(res){
																	var s0_x = eval("("+res+")");
																	layer.open({
																		  type: 1
																		  ,offset: '250px' //具体配置参考：offset参数项
																		  ,content: '<div style="padding: 20px 80px;">'+s0_x.message+'</div>'
																		  ,btn: '关闭全部'
																		  ,btnAlign: 'c' //按钮居中
																		  ,shade: 0 //不显示遮罩
																		  ,yes: function(){
																			  $.ajax(
																						{
																							type:'POST'
																							,url:'adm.action'
																							,data:"action=QueryCash&usr_account="+data[nums*(obj.curr-1)+1].usr_account
																							,success:function(res){
																								var s0_x = eval("("+res+")");
																								var cash = s0_x.usr_cash;
																								 $('.yuan').eq(1).html(cash+'元');
																							}
																						,error:function(res){
																							
																						}
																						});
																		   		 layer.closeAll();
																		  }
																		});
																}
																,error:function(res){
																	alert("无法连接服务器");
																}
														});
							        		      });
							        		    }
							        		  });
											});
							        			
							        	  $('#biuuu_city_list tr').eq(1).find('#btn_group').on('click','#btn_02',function(){
							        		//示范一个公告层
							        		  layer.open({
							        		    type: 1
							        		    ,title: '温馨提示' //不显示标题栏
							        		    ,closeBtn: false
							        		    ,area: '300px;'
							        		    ,shade: 0.3
							        		    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
							        		    ,resize: false
							        		    ,btn: ['确定修车', '取消']
							        		    ,btnAlign: 'c'
							        		    ,moveType: 1 //拖拽模式，0或者1
							        		    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">欢迎使用本系统，<br>正在提示你是否选择修车，如果需要修车请点击下面的确定按钮<br>不需要则点击取消！</div>'
							        		    ,success: function(layero){
							        		      $(".layui-layer-btn0").click(function(){
							        		    	  $.ajax({
															type:'POST'
																,url:'adm.action'
																,data:"action=Fix&usr_account="+data[nums*(obj.curr-1)+1].usr_account
																,success:function(res){
																	var s0_x = eval("("+res+")");
																	layer.open({
																		  type: 1
																		  ,offset: '250px' //具体配置参考：offset参数项
																		  ,content: '<div style="padding: 20px 80px;">'+s0_x.message+'</div>'
																		  ,btn: '关闭全部'
																		  ,btnAlign: 'c' //按钮居中
																		  ,shade: 0 //不显示遮罩
																		  ,yes: function(){
																			  $.ajax(
																						{
																							type:'POST'
																							,url:'adm.action'
																							,data:"action=QueryCash&usr_account="+data[nums*(obj.curr-1)+1].usr_account
																							,success:function(res){
																								var s0_x = eval("("+res+")");
																								var cash = s0_x.usr_cash;
																								 $('.yuan').eq(1).html(cash+'元');
																							}
																						,error:function(res){
																							
																						}
																						});
																		   		 layer.closeAll();
																		  }
																		});
																}
																,error:function(res){
																	alert("无法连接服务器");
																}
														});
							        		      });
							        		    }
							        		  });
											});
							        	  $('#biuuu_city_list tr').eq(1).find('#btn_group').on('click','#btn_03',function(){
							        		  layer.open({
								        		    type: 1
								        		    ,title: '温馨提示' //不显示标题栏
								        		    ,closeBtn: false
								        		    ,area: '300px;'
								        		    ,shade: 0.3
								        		    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
								        		    ,resize: false
								        		    ,btn: ['确定充值', '取消']
								        		    ,btnAlign: 'c'
								        		    ,moveType: 1 //拖拽模式，0或者1
								        		    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">欢迎使用本系统,<br>正在提示你是否选择充值<br>需要充值请点击下面的确定按钮<br><br><input id="recharge" style="color:#000" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入充值金额" class="layui-input"></div>'
								        		    ,success: function(layero){
								        		      $(".layui-layer-btn0").click(function(){
								        		    	  var usr_cash = $('#recharge').val();
								        		    	  $.ajax({
																type:'POST'
																	,url:'adm.action'
																	,data:"action=Recharge&usr_account="+data[nums*(obj.curr-1)+1].usr_account+'&usr_cash='+usr_cash
																	,success:function(res){
																		var s0_x = eval("("+res+")");
																		layer.open({
																			  type: 1
																			  ,offset: '250px' //具体配置参考：offset参数项
																			  ,content: '<div style="padding: 20px 80px;">'+s0_x.message+'</div>'
																			  ,btn: '关闭全部'
																			  ,btnAlign: 'c' //按钮居中
																			  ,shade: 0 //不显示遮罩
																			  ,yes: function(){
																					$.ajax(
																							{
																								type:'POST'
																								,url:'adm.action'
																								,data:"action=QueryCash&usr_account="+data[nums*(obj.curr-1)+1].usr_account
																								,success:function(res){
																									var s0_x = eval("("+res+")");
																									var cash = s0_x.usr_cash;
																									 $('.yuan').eq(1).html(cash+'元');
																								}
																							,error:function(res){
																								
																							}
																							});
																			   		 layer.closeAll();
																			  	}
																			});
																	}
																	,error:function(res){
																		alert("无法连接服务器");
																	}
															});
								        		      });
								        		     
								        		    }
								        		  });
											});
							        	  
							        	  $('#biuuu_city_list tr').eq(2).find('#btn_group').on('click','#btn_01',function(){
							        		//示范一个公告层
							        		  layer.open({
							        		    type: 1
							        		    ,title: '温馨提示' //不显示标题栏
							        		    ,closeBtn: false
							        		    ,area: '300px;'
							        		    ,shade: 0.3
							        		    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
							        		    ,resize: false
							        		    ,btn: ['确定投保', '取消']
							        		    ,btnAlign: 'c'
							        		    ,moveType: 1 //拖拽模式，0或者1
							        		    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">欢迎使用本系统，<br>正在提示你是否选择投保，如果需要投保请点击下面的确定按钮<br>不需要则点击取消！</div>'
							        		    ,success: function(layero){
							        		      $(".layui-layer-btn0").click(function(){
							        		    	  $.ajax({
															type:'POST'
																,url:'adm.action'
																,data:"action=Insure&usr_account="+data[nums*(obj.curr-1)+2].usr_account
																,success:function(res){
																	var s0_x = eval("("+res+")");
																	layer.open({
																		  type: 1
																		  ,offset: '250px' //具体配置参考：offset参数项
																		  ,content: '<div style="padding: 20px 80px;">'+s0_x.message+'</div>'
																		  ,btn: '关闭全部'
																		  ,btnAlign: 'c' //按钮居中
																		  ,shade: 0 //不显示遮罩
																		  ,yes: function(){
																			  $.ajax(
																						{
																							type:'POST'
																							,url:'adm.action'
																							,data:"action=QueryCash&usr_account="+data[nums*(obj.curr-1)+2].usr_account
																							,success:function(res){
																								var s0_x = eval("("+res+")");
																								var cash = s0_x.usr_cash;
																								 $('.yuan').eq(2).html(cash+'元');
																							}
																						,error:function(res){
																							
																						}
																						});
																		   		 layer.closeAll();
																		  }
																		});
																}
																,error:function(res){
																	alert("无法连接服务器");
																}
														});
							        		      });
							        		    }
							        		  });
											});
							        			
							        	  $('#biuuu_city_list tr').eq(2).find('#btn_group').on('click','#btn_02',function(){
							        		//示范一个公告层
							        		  layer.open({
							        		    type: 1
							        		    ,title: '温馨提示' //不显示标题栏
							        		    ,closeBtn: false
							        		    ,area: '300px;'
							        		    ,shade: 0.3
							        		    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
							        		    ,resize: false
							        		    ,btn: ['确定修车', '取消']
							        		    ,btnAlign: 'c'
							        		    ,moveType: 1 //拖拽模式，0或者1
							        		    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">欢迎使用本系统，<br>正在提示你是否选择修车，如果需要修车请点击下面的确定按钮<br>不需要则点击取消！</div>'
							        		    ,success: function(layero){
							        		      $(".layui-layer-btn0").click(function(){
							        		    	  $.ajax({
															type:'POST'
																,url:'adm.action'
																,data:"action=Fix&usr_account="+data[nums*(obj.curr-1)+2].usr_account
																,success:function(res){
																	var s0_x = eval("("+res+")");
																	layer.open({
																		  type: 1
																		  ,offset: '250px' //具体配置参考：offset参数项
																		  ,content: '<div style="padding: 20px 80px;">'+s0_x.message+'</div>'
																		  ,btn: '关闭全部'
																		  ,btnAlign: 'c' //按钮居中
																		  ,shade: 0 //不显示遮罩
																		  ,yes: function(){
																			  $.ajax(
																						{
																							type:'POST'
																							,url:'adm.action'
																							,data:"action=QueryCash&usr_account="+data[nums*(obj.curr-1)+2].usr_account
																							,success:function(res){
																								var s0_x = eval("("+res+")");
																								var cash = s0_x.usr_cash;
																								 $('.yuan').eq(2).html(cash+'元');
																							}
																						,error:function(res){
																							
																						}
																						});
																		   		 layer.closeAll();
																		  }
																		});
																}
																,error:function(res){
																	alert("无法连接服务器");
																}
														});
							        		      });
							        		    }
							        		  });
											});
							        	  $('#biuuu_city_list tr').eq(2).find('#btn_group').on('click','#btn_03',function(){
							        		  layer.open({
								        		    type: 1
								        		    ,title: '温馨提示' //不显示标题栏
								        		    ,closeBtn: false
								        		    ,area: '300px;'
								        		    ,shade: 0.3
								        		    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
								        		    ,resize: false
								        		    ,btn: ['确定充值', '取消']
								        		    ,btnAlign: 'c'
								        		    ,moveType: 1 //拖拽模式，0或者1
								        		    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">欢迎使用本系统,<br>正在提示你是否选择充值<br>需要充值请点击下面的确定按钮<br><br><input id="recharge" style="color:#000" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入充值金额" class="layui-input"></div>'
								        		    ,success: function(layero){
								        		      $(".layui-layer-btn0").click(function(){
								        		    	  var usr_cash = $('#recharge').val();
								        		    	  $.ajax({
																type:'POST'
																	,url:'adm.action'
																	,data:"action=Recharge&usr_account="+data[nums*(obj.curr-1)+2].usr_account+'&usr_cash='+usr_cash
																	,success:function(res){
																		var s0_x = eval("("+res+")");
																		layer.open({
																			  type: 1
																			  ,offset: '250px' //具体配置参考：offset参数项
																			  ,content: '<div style="padding: 20px 80px;">'+s0_x.message+'</div>'
																			  ,btn: '关闭全部'
																			  ,btnAlign: 'c' //按钮居中
																			  ,shade: 0 //不显示遮罩
																			  ,yes: function(){
																					$.ajax(
																							{
																								type:'POST'
																								,url:'adm.action'
																								,data:"action=QueryCash&usr_account="+data[nums*(obj.curr-1)+2].usr_account
																								,success:function(res){
																									var s0_x = eval("("+res+")");
																									var cash = s0_x.usr_cash;
																									 $('.yuan').eq(2).html(cash+'元');
																								}
																							,error:function(res){
																								
																							}
																							});
																			   		 layer.closeAll();
																			  	}
																			});
																	}
																	,error:function(res){
																		alert("无法连接服务器");
																	}
															});
								        		      });
								        		     
								        		    }
								        		  });
											});
							        	  $('#biuuu_city_list tr').eq(3).find('#btn_group').on('click','#btn_01',function(){
							        		//示范一个公告层
							        		  layer.open({
							        		    type: 1
							        		    ,title: '温馨提示' //不显示标题栏
							        		    ,closeBtn: false
							        		    ,area: '300px;'
							        		    ,shade: 0.3
							        		    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
							        		    ,resize: false
							        		    ,btn: ['确定投保', '取消']
							        		    ,btnAlign: 'c'
							        		    ,moveType: 1 //拖拽模式，0或者1
							        		    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">欢迎使用本系统，<br>正在提示你是否选择投保，如果需要投保请点击下面的确定按钮<br>不需要则点击取消！</div>'
							        		    ,success: function(layero){
							        		      $(".layui-layer-btn0").click(function(){
							        		    	  $.ajax({
															type:'POST'
																,url:'adm.action'
																,data:"action=Insure&usr_account="+data[nums*(obj.curr-1)+3].usr_account
																,success:function(res){
																	var s0_x = eval("("+res+")");
																	layer.open({
																		  type: 1
																		  ,offset: '250px' //具体配置参考：offset参数项
																		  ,content: '<div style="padding: 20px 80px;">'+s0_x.message+'</div>'
																		  ,btn: '关闭全部'
																		  ,btnAlign: 'c' //按钮居中
																		  ,shade: 0 //不显示遮罩
																		  ,yes: function(){
																			  $.ajax(
																						{
																							type:'POST'
																							,url:'adm.action'
																							,data:"action=QueryCash&usr_account="+data[nums*(obj.curr-1)+3].usr_account
																							,success:function(res){
																								var s0_x = eval("("+res+")");
																								var cash = s0_x.usr_cash;
																								 $('.yuan').eq(3).html(cash+'元');
																							}
																						,error:function(res){
																							
																						}
																						});
																		   		 layer.closeAll();
																		  }
																		});
																}
																,error:function(res){
																	alert("无法连接服务器");
																}
														});
							        		      });
							        		    }
							        		  });
											});
							        			
							        	  $('#biuuu_city_list tr').eq(3).find('#btn_group').on('click','#btn_02',function(){
							        		//示范一个公告层
							        		  layer.open({
							        		    type: 1
							        		    ,title: '温馨提示' //不显示标题栏
							        		    ,closeBtn: false
							        		    ,area: '300px;'
							        		    ,shade: 0.3
							        		    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
							        		    ,resize: false
							        		    ,btn: ['确定修车', '取消']
							        		    ,btnAlign: 'c'
							        		    ,moveType: 1 //拖拽模式，0或者1
							        		    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">欢迎使用本系统，<br>正在提示你是否选择修车，如果需要修车请点击下面的确定按钮<br>不需要则点击取消！</div>'
							        		    ,success: function(layero){
							        		      $(".layui-layer-btn0").click(function(){
							        		    	  $.ajax({
															type:'POST'
																,url:'adm.action'
																,data:"action=Fix&usr_account="+data[nums*(obj.curr-1)+3].usr_account
																,success:function(res){
																	var s0_x = eval("("+res+")");
																	layer.open({
																		  type: 1
																		  ,offset: '250px' //具体配置参考：offset参数项
																		  ,content: '<div style="padding: 20px 80px;">'+s0_x.message+'</div>'
																		  ,btn: '关闭全部'
																		  ,btnAlign: 'c' //按钮居中
																		  ,shade: 0 //不显示遮罩
																		  ,yes: function(){
																			  $.ajax(
																						{
																							type:'POST'
																							,url:'adm.action'
																							,data:"action=QueryCash&usr_account="+data[nums*(obj.curr-1)+3].usr_account
																							,success:function(res){
																								var s0_x = eval("("+res+")");
																								var cash = s0_x.usr_cash;
																								 $('.yuan').eq(3).html(cash+'元');
																							}
																						,error:function(res){
																							
																						}
																						});
																		   		 layer.closeAll();
																		  }
																		});
																}
																,error:function(res){
																	alert("无法连接服务器");
																}
														});
							        		      });
							        		    }
							        		  });
											});
							        	  $('#biuuu_city_list tr').eq(3).find('#btn_group').on('click','#btn_03',function(){
							        		  layer.open({
								        		    type: 1
								        		    ,title: '温馨提示' //不显示标题栏
								        		    ,closeBtn: false
								        		    ,area: '300px;'
								        		    ,shade: 0.3
								        		    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
								        		    ,resize: false
								        		    ,btn: ['确定充值', '取消']
								        		    ,btnAlign: 'c'
								        		    ,moveType: 1 //拖拽模式，0或者1
								        		    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">欢迎使用本系统,<br>正在提示你是否选择充值<br>需要充值请点击下面的确定按钮<br><br><input id="recharge" style="color:#000" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入充值金额" class="layui-input"></div>'
								        		    ,success: function(layero){
								        		      $(".layui-layer-btn0").click(function(){
								        		    	  var usr_cash = $('#recharge').val();
								        		    	  $.ajax({
																type:'POST'
																	,url:'adm.action'
																	,data:"action=Recharge&usr_account="+data[nums*(obj.curr-1)+3].usr_account+'&usr_cash='+usr_cash
																	,success:function(res){
																		var s0_x = eval("("+res+")");
																		layer.open({
																			  type: 1
																			  ,offset: '250px' //具体配置参考：offset参数项
																			  ,content: '<div style="padding: 20px 80px;">'+s0_x.message+'</div>'
																			  ,btn: '关闭全部'
																			  ,btnAlign: 'c' //按钮居中
																			  ,shade: 0 //不显示遮罩
																			  ,yes: function(){
																					$.ajax(
																							{
																								type:'POST'
																								,url:'adm.action'
																								,data:"action=QueryCash&usr_account="+data[nums*(obj.curr-1)+3].usr_account
																								,success:function(res){
																									var s0_x = eval("("+res+")");
																									var cash = s0_x.usr_cash;
																									 $('.yuan').eq(3).html(cash+'元');
																								}
																							,error:function(res){
																								
																							}
																							});
																			   		 layer.closeAll();
																			  	}
																			});
																	}
																	,error:function(res){
																		alert("无法连接服务器");
																	}
															});
								        		      });
								        		     
								        		    }
								        		  });
											});
							        	  $('#biuuu_city_list tr').eq(4).find('#btn_group').on('click','#btn_01',function(){
							        		//示范一个公告层
							        		  layer.open({
							        		    type: 1
							        		    ,title: '温馨提示' //不显示标题栏
							        		    ,closeBtn: false
							        		    ,area: '300px;'
							        		    ,shade: 0.3
							        		    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
							        		    ,resize: false
							        		    ,btn: ['确定投保', '取消']
							        		    ,btnAlign: 'c'
							        		    ,moveType: 1 //拖拽模式，0或者1
							        		    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">欢迎使用本系统，<br>正在提示你是否选择投保，如果需要投保请点击下面的确定按钮<br>不需要则点击取消！</div>'
							        		    ,success: function(layero){
							        		      $(".layui-layer-btn0").click(function(){
							        		    	  $.ajax({
															type:'POST'
																,url:'adm.action'
																,data:"action=Insure&usr_account="+data[nums*(obj.curr-1)+4].usr_account
																,success:function(res){
																	var s0_x = eval("("+res+")");
																	layer.open({
																		  type: 1
																		  ,offset: '250px' //具体配置参考：offset参数项
																		  ,content: '<div style="padding: 20px 80px;">'+s0_x.message+'</div>'
																		  ,btn: '关闭全部'
																		  ,btnAlign: 'c' //按钮居中
																		  ,shade: 0 //不显示遮罩
																		  ,yes: function(){
																			  $.ajax(
																						{
																							type:'POST'
																							,url:'adm.action'
																							,data:"action=QueryCash&usr_account="+data[nums*(obj.curr-1)+4].usr_account
																							,success:function(res){
																								var s0_x = eval("("+res+")");
																								var cash = s0_x.usr_cash;
																								 $('.yuan').eq(4).html(cash+'元');
																							}
																						,error:function(res){
																							
																						}
																						});
																		   		 layer.closeAll();
																		  }
																		});
																}
																,error:function(res){
																	alert("无法连接服务器");
																}
														});
							        		      });
							        		    }
							        		  });
											});
							        			
							        	  $('#biuuu_city_list tr').eq(4).find('#btn_group').on('click','#btn_02',function(){
							        		//示范一个公告层
							        		  layer.open({
							        		    type: 1
							        		    ,title: '温馨提示' //不显示标题栏
							        		    ,closeBtn: false
							        		    ,area: '300px;'
							        		    ,shade: 0.3
							        		    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
							        		    ,resize: false
							        		    ,btn: ['确定修车', '取消']
							        		    ,btnAlign: 'c'
							        		    ,moveType: 1 //拖拽模式，0或者1
							        		    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">欢迎使用本系统，<br>正在提示你是否选择修车，如果需要修车请点击下面的确定按钮<br>不需要则点击取消！</div>'
							        		    ,success: function(layero){
							        		      $(".layui-layer-btn0").click(function(){
							        		    	  $.ajax({
															type:'POST'
																,url:'adm.action'
																,data:"action=Fix&usr_account="+data[nums*(obj.curr-1)+4].usr_account
																,success:function(res){
																	var s0_x = eval("("+res+")");
																	layer.open({
																		  type: 1
																		  ,offset: '250px' //具体配置参考：offset参数项
																		  ,content: '<div style="padding: 20px 80px;">'+s0_x.message+'</div>'
																		  ,btn: '关闭全部'
																		  ,btnAlign: 'c' //按钮居中
																		  ,shade: 0 //不显示遮罩
																		  ,yes: function(){
																			  $.ajax(
																						{
																							type:'POST'
																							,url:'adm.action'
																							,data:"action=QueryCash&usr_account="+data[nums*(obj.curr-1)+4].usr_account
																							,success:function(res){
																								var s0_x = eval("("+res+")");
																								var cash = s0_x.usr_cash;
																								 $('.yuan').eq(4).html(cash+'元');
																							}
																						,error:function(res){
																							
																						}
																						});
																		   		 layer.closeAll();
																		  }
																		});
																}
																,error:function(res){
																	alert("无法连接服务器");
																}
														});
							        		      });
							        		    }
							        		  });
											});
							        	  $('#biuuu_city_list tr').eq(4).find('#btn_group').on('click','#btn_03',function(){
							        		  layer.open({
								        		    type: 1
								        		    ,title: '温馨提示' //不显示标题栏
								        		    ,closeBtn: false
								        		    ,area: '300px;'
								        		    ,shade: 0.3
								        		    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
								        		    ,resize: false
								        		    ,btn: ['确定充值', '取消']
								        		    ,btnAlign: 'c'
								        		    ,moveType: 1 //拖拽模式，0或者1
								        		    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">欢迎使用本系统,<br>正在提示你是否选择充值<br>需要充值请点击下面的确定按钮<br><br><input id="recharge" style="color:#000" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入充值金额" class="layui-input"></div>'
								        		    ,success: function(layero){
								        		      $(".layui-layer-btn0").click(function(){
								        		    	  var usr_cash = $('#recharge').val();
								        		    	  $.ajax({
																type:'POST'
																	,url:'adm.action'
																	,data:"action=Recharge&usr_account="+data[nums*(obj.curr-1)+4].usr_account+'&usr_cash='+usr_cash
																	,success:function(res){
																		var s0_x = eval("("+res+")");
																		layer.open({
																			  type: 1
																			  ,offset: '250px' //具体配置参考：offset参数项
																			  ,content: '<div style="padding: 20px 80px;">'+s0_x.message+'</div>'
																			  ,btn: '关闭全部'
																			  ,btnAlign: 'c' //按钮居中
																			  ,shade: 0 //不显示遮罩
																			  ,yes: function(){
																					$.ajax(
																							{
																								type:'POST'
																								,url:'adm.action'
																								,data:"action=QueryCash&usr_account="+data[nums*(obj.curr-1)+4].usr_account
																								,success:function(res){
																									var s0_x = eval("("+res+")");
																									var cash = s0_x.usr_cash;
																									 $('.yuan').eq(4).html(cash+'元');
																								}
																							,error:function(res){
																								
																							}
																							});
																			   		 layer.closeAll();
																			  	}
																			});
																	}
																	,error:function(res){
																		alert("无法连接服务器");
																	}
															});
								        		      });
								        		     
								        		    }
								        		  });
											});
							    }
							})
					}
					,error:function(res){
						alert("error");
					}
				
				});
			}
		</script>

</html>