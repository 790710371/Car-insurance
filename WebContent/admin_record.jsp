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
<script src="laypage/laypage/laypage.js"></script>
<script src="layer-v3.0.3/layer/layer.js"></script>
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
          <li><a href="#">操作记录</a></li>
          <li><a href="admin_setting.jsp">设置管理员</a></li>
      </ul>
          <h3 class="am-icon-users on"><em></em> <a href="#">商家功能</a></h3>
       <li><a href="usr_insure.jsp">投保修车 </a></li>
        <li><a href="insure_record.jsp">投保记录</a></li>
        <li><a href="check_record.jsp">修车记录</a></li>

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
    			<div class="layui-form-pane">
			  <div class="layui-form-item" style="display: inline-block;margin-left:10px;margin-top: 2px">
			    <label class="layui-form-label">日期选择</label>
			    <div class="layui-input-inline">
			      <input class="layui-input" placeholder="开始日" id="LAY_demorange_s">
			   	 </div> 
			    	<div class="layui-input-inline">
			     <input class="layui-input" placeholder="截止日" id="LAY_demorange_e">
			    	</div>
			    	<button class="layui-btn layui-btn-normal" id="btn_click">确定</button>
      				<dl class="am-icon-home" style="float: right;margin-left:240px">当前位置： 管理记录 > <a href="#">操作记录</a></dl>
      
		  			</div>
				</div> 
				
      <!--这里打开的是新页面-->
    </div>
			<div class="tab_content_01">
			
   
          <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover">
          <colgroup>
								<col width="100">
								<col width="200">
								<col width="150">
								<col width="150">
								<col width="150">
							</colgroup>
            <thead>
              <tr class="am-success">

                <th class="table-id">ID</th>
                <th class="table-title">用户名</th>
                <th class="table-type">用户身份</th>
                <th class="table-author am-hide-sm-only">操作</th>
                <th class="table-date am-hide-sm-only">操作日期</th>
              </tr>
            </thead>
            <tbody id="operate_record_display">
            
            </tbody>
          </table>
    		<div id="operate_record" style="text-align:center;"></div>
    		</div>
    		
 
 <div class="foods">
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
	<!--从这里开始是调用日期控件-->
	layui.use('laydate', function(){
		  var laydate = layui.laydate;
		  
		  var start = {
		    min: '2017-01-01 23:59:59'
		    ,max: '2099-06-16 23:59:59'
		    ,istoday: false
		    ,choose: function(datas){
		      end.min = datas; //开始日选好后，重置结束日的最小日期
		      end.start = datas //将结束日的初始值设定为开始日
		    }
		  };
		  
		  var end = {
		    min: laydate.now()
		    ,max: '2099-06-16 23:59:59'
		    ,istoday: false
		    ,choose: function(datas){
		      start.max = datas; //结束日选好后，重置开始日的最大日期
		    }
		  };
		  
		  document.getElementById('LAY_demorange_s').onclick = function(){
		    start.elem = this;
		    laydate(start);
		  }
		  document.getElementById('LAY_demorange_e').onclick = function(){
		    end.elem = this
		    laydate(end);
		  }
		});
	var startDate;
	var endDate;
	<!--这里监听按钮事件获取日期控件的值-->
	$('#btn_click').click(function(){
		 startDate = $('#LAY_demorange_s').val();
		 endDate = $('#LAY_demorange_e').val();
		//var arr_s = startDate.split('-');
		//var arr_t = endDate.split('-');
		if(startDate==''){
			alert('请选择开始日期');
			return;
		}
		if(endDate==''){
			alert('请选择结束日期');
			return;
		}
		 //startDate = arr_s[0]+arr_s[1]+arr_s[2];
		// endDate = arr_t[0]+arr_t[1]+arr_t[2];
		// alert(startDate+'  '+endDate);
		 
		 <!--从这里开始是查询操作记录-->
			var data ;
			$.ajax({
				type:'POST'
				,url:'adm.action'
				,data:"action=QueryOperateRecord&startDate="+startDate+"&endDate="+endDate
				,success:function(res){
				    data =  eval("("+res+")");
				    data = data.operate_record;
				    var nums = 5; //每页出现的数量
					var pages = Math.ceil(data.length/nums); //得到总页数
					var thisDate = function(curr){
					    var str = '', last = curr*nums - 1;
					    last = last >= data.length ? (data.length-1) : last;
					    for(var i = (curr*nums - nums); i <= last; i++){
					        str += '<tr>'+'<td>'+data[i].user_id+'</td>'+'<td>'+data[i].operate_account+'</td>'+'<td>'+data[i].identity_flag+'</td>'+'<td>'+data[i].operate_type+'</td>'+'<td>'+data[i].operate_date+'</td>'+'</tr>';
					    }
					    return str;
					};

					//调用分页
					laypage({
					    cont: 'operate_record',
					    pages: pages,
					    skin: '#009688',
					    jump: function(obj){
					        document.getElementById('operate_record_display').innerHTML = thisDate(obj.curr);
					    }
					})
				}
				,error:function(){
					alert("error");
				}
			});
	});
	
	</script>
	
</html>