/*
 * @Author: XiaoJun 
 * @Date: 2021-06-20 00:10:31 
 * @Last Modified by: XiaoJun
 * @Last Modified time: 2021-06-21 17:43:25
 */

function reg() {
	var account = $("#account").val();
	var password = $("#password").val();
	//发送Ajax请求
	$.ajax({
		// 请求路径
		url : "user/insertSelective",
		// 请求类型
		type : "post",
		async: false,
		// data表示发送的数据
		data : {
			"account" : account,
			"password" : password
		},
		// contentType不能要 加了拿不到数据
		// 定义回调响应的数据格式为JSON字符串，该属性可以省略
		dataType : "json",
		// 成功响应的结果
		success : function(data) {
			var count = data;
			if(count == 1){
				swal('注册成功！','\n\n赶紧添加一个页面试试叭！！！','success');
				$('button, .confirm').click(function () {
					location.href = './login.html'
				});
			} else if (count == 10){
				swal('注册失败！','\n\n账户名或密码不能为空！！！','error');
			}else {
					swal('注册失败！','\n\n你注册的账号以存在！！！','error');
				}
			}
	});
}