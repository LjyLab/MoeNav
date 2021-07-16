/*
 * @Author: XiaoJun 
 * @Date: 2021-06-20 00:09:22 
 * @Last Modified by:   XiaoJun 
 * @Last Modified time: 2021-06-20 00:09:22 
 */

package com.zking.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 拦截器响应的路径
// 登陆则释放
@Controller
@RequestMapping("index")
public class ErrorController {
	@RequestMapping("/links")
	public String AddLinks(HttpServletResponse response) {
		return "redirect:../AddLinks.html";
	}

	//友链的路径
	@RequestMapping("/cont")
	public String AddCont(HttpServletResponse response) {
		return "redirect:../AddCont.html";
	}
}