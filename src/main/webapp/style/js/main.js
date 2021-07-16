/*
 * @Author: XiaoJun 
 * @Date: 2021-06-21 17:33:14 
 * @Last Modified by:   XiaoJun 
 * @Last Modified time: 2021-06-21 17:33:14 
 */

$(function() {// 等页面加载完毕之后调用
	showLinks();
	showCont();
});

function showLinks(){
	$.ajax({
		// 请求路径
		url : "links/selectByExample",
		// 请求类型
		type : "post",
		// data表示发送的数据
		// 定义回调响应的数据格式为JSON字符串，该属性可以省略
		dataType : "json",
		// 成功响应的结果
		success : function(data) {
			var links = data;
			var str = '';
			for (var i = 0; i < links.length; i++) {

				str += '<a href="'+links[i].linkUrl+'" rel="nofollow" target="'+links[i].linkTarget+'">';
				str += '<div class="item">';
				str += '	<div class="bg" style="background-color: '+links[i].linkStyle+'">';
				str += '	</div>';
				str += '	<div class="inner">';
				str += '		<span style="font-weight:bold; color: '+links[i].linkSort+'; font-size: 17px">'+links[i].linkName+'</span>';
				str += '	</div>';
				str += '</div>';
				str += '</a>';

			}
			$("#ShowLinks").append(str);
		}
	});
}

function showCont(){
	$.ajax({
		// 请求路径
		url : "cont/selectByExample",
		// 请求类型
		type : "post",
		// data表示发送的数据
		// 定义回调响应的数据格式为JSON字符串，该属性可以省略
		dataType : "json",
		// 成功响应的结果
		success : function(cont) {
			var show = cont;
			var str = '';
			for (var i = 0; i < show.length; i++) {

				str += '<a href="'+show[i].moeUrl+'" target="_blank">';
				str += '	<div class="item">';
				str += '		<div class="avatar">';
				str += '			<img src="'+show[i].moeImage+'">';
				str += '		</div>';
				str += '		<div class="inner">';
				str += '			<h5><span style="font-weight:bold; color: #ff78b6; font-size: 22px">'+show[i].moeSort+'</span> '+show[i].moeName+'</h5>';
				str += '			<p>';
				str += '				'+show[i].moeDescription+'';
				str += '			</p>';
				str += '		</div>';
				str += '	</div>';
				str += '</a>';

			}
			$("#showcont").append(str);
		}
	});
}

