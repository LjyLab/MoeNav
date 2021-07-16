/*
 * @Author: XiaoJun 
 * @Date: 2021-06-20 00:10:01 
 * @Last Modified by:   XiaoJun 
 * @Last Modified time: 2021-06-20 00:10:01 
 */

function show(file) {
    var reader = new FileReader(); // 实例化一个FileReader对象，用于读取文件
    var img = document.getElementById('upload_img'); // 获取要显示图片的标签

    //读取File对象的数据
    reader.onload = function(evt) {
        img.width = "200";
        img.height = "200";
        img.src = evt.target.result;
    }
    reader.readAsDataURL(file.files[0]);
}

function AddCont() {
    var moe_name = $("#moe_name").val();
    var moe_url = $("#moe_url").val();
    var moe_sort = $("#moe_sort").val();
    var moe_image = $("#moe_image").val();
    var moe_description = $("#moe_description").val();
    $.ajax({
        // 请求路径
        url : "cont/insertSelective",
        // 请求类型
        type : "post",
        // async: false,
        // data表示发送的数据
        data : JSON.stringify({
            "moeName" : moe_name,
            "moeUrl" : moe_url,
            "moeSort" : moe_sort,
            "moeImage" : moe_image,
            "moeDescription" : moe_description
        }),
        contentType:"application/json;charset=utf-8",
        // 定义回调响应的数据格式为JSON字符串，该属性可以省略
        dataType : "json",
        // 成功响应的结果
        success : function(data) {
            if(data>0){
                swal('哇！恭喜添加成功','\n\n友情链接已经可以显示啦！不出意外的话马上就能看见啦~','success');
                $('button, .confirm').click(function () {
                    location.href = './'
                });
            }else{
                swal('哎呀！没有上传成功呢！','\n\n不要气馁不妨再试一次？','error');
            }
        }
    });
}

function GoOut() {
    swal('退出账号成功！','\n\n即将为你跳转首页！','success');
    $('button, .confirm').click(function () {
        location.href = 'user/logout'
    })
}