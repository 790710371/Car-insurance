<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>用户注册</title>
<link rel="stylesheet" href="layui/css/layui.css" type="text/css" />
<link rel="stylesheet" href="css/register.css" />
<script src="js/jquery-1.12.0.min.js"></script>
<script src="layui/layui.js"></script>
</head>

<body>
	<div class="register">
		<h1>用户注册</h1>
		<div class="register_bar">
			<form class="layui-form" action="<%=request.getContextPath()%>/LR.action?action=Register" method="post">
				<div class="layui-form-item">
					<label class="layui-form-label">用户名</label>
					<div class="layui-input-inline">
						<input type="text" name="usr_account" required lay-verify="required"
							placeholder="请输入用户名" autocomplete="off" class="layui-input" id="usr_name">
					</div>
					<p class="notice"></p>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">密码</label>
					<div class="layui-input-inline">
						<input type="password" name="usr_pwd" required lay-verify="required"
							placeholder="请输入密码" autocomplete="off" class="layui-input" id="pwd">
					</div>
					<div class="layui-form-mid layui-word-aux">请输入以字母开头</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">邮箱</label>
					<div class="layui-input-inline">
						<input type="text" name="usr_email" required lay-verify="required"
							placeholder="请输入邮箱" autocomplete="off" class="layui-input" id="email">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">姓名</label>
					<div class="layui-input-inline">
						<input type="text" name="usr_name" required lay-verify="required"
							placeholder="请输入姓名" autocomplete="off" class="layui-input" id='name'>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">身份证号码</label>
					<div class="layui-input-inline">
						<input type="text" name="usr_IDcard" required
							lay-verify="required" placeholder="请输入身份证号码" autocomplete="off"
							class="layui-input" id="IDcard">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">车牌号</label>
					<div class="layui-input-inline">
						<input type="text" name="usr_carID" required lay-verify="required"
							placeholder="请输入车牌号" autocomplete="off" class="layui-input" id="cardID">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">手机号</label>
					<div class="layui-input-inline">
						<input type="text" name="usr_phone" required lay-verify="required"
							placeholder="请输入手机号" autocomplete="off" class="layui-input" id='phone'>
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
		var usr_name = $('#usr_name').val();
		var usr_email = $('#email').val();
		var name = $('#name').val();
		var pwd = $('#pwd').val();
		var phone= $('#phone').val();
		var IDcard = $('#IDcard').val();
		var carID = $('#carID').val();
		if(isChinaOrNumbOrLett(usr_name)&&checkEmail(usr_email)&&ismobile(phone)&&isNumberOrLetter(pwd)&&checkIdcard(IDcard)){
			$("form").submit();
			return;
		}else{
			alert('提示：您填写的表单有误，请仔细填写');
		}

	})
	function isChinaOrNumbOrLett( s ){//判断是否是汉字、字母、数字组成，用于用户名的检查
			var regu = "^[0-9a-zA-Z\u4e00-\u9fa5]+$";  
			var re = new RegExp(regu);
			if (re.test(s)) {
				return true;
			}
			return false;
		}
	//检查邮箱号是否正确
	function checkEmail(email){
		var emailReg = /^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$/;
		if( emailReg.test(email) ){
		return true;
		}
		return false;
	}
	//检查是否符合手机号
	function ismobile(mobile)
{
    if(mobile.length!=11)
    {
        document.form1.mobile.focus();
        return false;
    }
    
    var myreg = /^(((13[0-9]{1})|159)+\d{8})$/;
    if(!myreg.test(mobile))
    {
        document.form1.mobile.focus();
        return false;
    }
    return true;
}
	//检验是否只是由数字和字母组成，用于密码检验
	function isNumberOrLetter( s ){//判断是否是数字或字母
		var regu = "^[0-9a-zA-Z]+$";
		var re = new RegExp(regu);
		if (re.test(s)) {
			return true;
		}
	return false;
	}
	//检查身份证是否正确
	function checkIdcard(idcard){ 
		var area={11:"北京",12:"天津",13:"河北",14:"山西",15:"内蒙古",21:"辽宁",22:"吉林",23:"黑龙江",31:"上海",32:"江苏",33:"浙江",34:"安徽",35:"福建",36:"江西",37:"山东",41:"河南",42:"湖北",43:"湖南",44:"广东",45:"广西",46:"海南",50:"重庆",51:"四川",52:"贵州",53:"云南",54:"西藏",61:"陕西",62:"甘肃",63:"青海",64:"宁夏",65:"新疆",71:"台湾",81:"香港",82:"澳门",91:"国外"} 
		var idcard,Y,JYM; 
		var S,M; 
		var idcard_array = new Array(); 
		idcard_array = idcard.split(""); 

		//地区检验 
		if(area[parseInt(idcard.substr(0,2))]==null) return false; 
		//身份号码位数及格式检验 
		switch(idcard.length){ 
		case 15: 
		if ( (parseInt(idcard.substr(6,2))+1900) % 4 == 0 || ((parseInt(idcard.substr(6,2))+1900) % 100 == 0 && (parseInt(idcard.substr(6,2))+1900) % 4 == 0 )){ 
		ereg=/^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}$/;//测试出生日期的合法性 
		} else { 
		ereg=/^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))[0-9]{3}$/;//测试出生日期的合法性 
		} 
		
		if(ereg.test(idcard)) return true; 
		else return false; 
		break; 
		case 18: 
		//18位身份号码检测 
		//出生日期的合法性检查 
		//闰年月日:((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9])) 
		//平年月日:((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8])) 
		if ( parseInt(idcard.substr(6,4)) % 4 == 0 || (parseInt(idcard.substr(6,4)) % 100 == 0 && parseInt(idcard.substr(6,4))%4 == 0 )){ 
		ereg=/^[1-9][0-9]{5}19[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}[0-9Xx]$/;//闰年出生日期的合法性正则表达式 
		} else { 
		ereg=/^[1-9][0-9]{5}19[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))[0-9]{3}[0-9Xx]$/;//平年出生日期的合法性正则表达式 
		} 
		if(ereg.test(idcard)){//测试出生日期的合法性 
		//计算校验位 
		S = (parseInt(idcard_array[0]) + parseInt(idcard_array[10])) * 7 
		+ (parseInt(idcard_array[1]) + parseInt(idcard_array[11])) * 9 
		+ (parseInt(idcard_array[2]) + parseInt(idcard_array[12])) * 10 
		+ (parseInt(idcard_array[3]) + parseInt(idcard_array[13])) * 5 
		+ (parseInt(idcard_array[4]) + parseInt(idcard_array[14])) * 8 
		+ (parseInt(idcard_array[5]) + parseInt(idcard_array[15])) * 4 
		+ (parseInt(idcard_array[6]) + parseInt(idcard_array[16])) * 2 
		+ parseInt(idcard_array[7]) * 1 
		+ parseInt(idcard_array[8]) * 6 
		+ parseInt(idcard_array[9]) * 3 ; 
		Y = S % 11; 
		M = "F"; 
		JYM = "10X98765432"; 
		M = JYM.substr(Y,1);//判断校验位 
		if(M == idcard_array[17]) return true; //检测ID的校验位 
		else return false; 
		} 
		else return false;
		break; 
		default: 
		return false; 
		break; 
	} 
		//车牌号验证
		function checkCarId(carID){
			var re=/^[\u4e00-\u9fa5]{1}[A-Z]{1}[A-Z_0-9]{5}$/;
			if(carID.search(re)==-1)
			{
			   return false;
			}
			return true;
		}
} 
</script>
</html>