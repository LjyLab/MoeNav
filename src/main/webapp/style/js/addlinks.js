/*
 * @Author: XiaoJun 
 * @Date: 2021-06-20 00:10:07 
 * @Last Modified by:   XiaoJun 
 * @Last Modified time: 2021-06-20 00:10:07 
 */

function addlinks() {
    var link_name = $("#link_name").val();
    var link_url = $("#link_url").val();
    var link_sort = $("#link_sort").val();
    var link_style = $("#link_style").val();
    var link_target = $("#link_target").val();

    // alert(link_url);
    // alert(link_style);
    $.ajax({
        // 请求路径
        url : "links/insertSelective",
        // 请求类型
        type : "post",
        async: true,
        // data表示发送的数据
        data : JSON.stringify({
            "linkName" : link_name,
            "linkUrl" : link_url,
            "linkSort" : link_sort,
            "linkStyle" : link_style,
            "linkTarget" : link_target
        }),
        contentType:"application/json;charset=utf-8",
        // 定义回调响应的数据格式为JSON字符串，该属性可以省略
        dataType : "json",
        // 成功响应的结果
        success : function(data) {
            if(data>0){
                swal('哇！恭喜添加成功','\n\n链接已经上架！不出意外的话马上就能看见啦~','success');
                $('button, .confirm').click(function () {
                    location.href = './'
                });
            }else if (data == 0){
                swal('都没有登陆！','\n\n不要气馁不妨再试一次？','error');
                $('button, .confirm').click(function () {
                    location.href = './login.html'
                });
            }else {
                swal('都没有登陆！','\n\n不要气馁不妨再试一次？','error');
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