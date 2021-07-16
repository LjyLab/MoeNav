/*
 * @Author: XiaoJun 
 * @Date: 2021-06-20 00:10:31 
 * @Last Modified by: XiaoJun
 * @Last Modified time: 2021-06-21 17:43:34
 */

function login(){
	var account = $("#userPhones").val();
	var password = $("#userPasswords").val();
	// alert(userPhone);
	// alert(userPassword);
	$.ajax({
		// 请求路径
		url : "user/selectByUser",
		// 请求类型
		type : "post",
		async: false,
		// data表示发送的数据
		data :{
			"account" : account,
			"password" : password
		},
		// 定义回调响应的数据格式为JSON字符串，该属性可以省略
		dataType : "json",
		// 成功响应的结果
		success : function(data) {
			var user = data;
			if(user == 1){
				swal('登陆成功','\n\n即将为你跳转首页！','success');
				$('button, .confirm').click(function () {
					location.href = './'
				})
			}else if (user == 0){
				swal('登陆失败','账号或密码错误~请重试！','error');
			}else {
				swal('登陆失败','\n\n请重试！','error');
			}
		}
	});
}
