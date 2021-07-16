/*
 * @Author: XiaoJun 
 * @Date: 2021-06-20 00:10:31 
 * @Last Modified by: XiaoJun
 * @Last Modified time: 2021-06-21 17:43:39
 */
package com.zking.controller;

import com.zking.entity.NavUsers;
import com.zking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/insertSelective")
    @ResponseBody
    int insertSelective(NavUsers users, Model model,HttpSession session) {
//            if (users.getAccount() == null && users.getPassword() == null) {
//                System.out.println("no");
//                 return Integer.parseInt(null);
//            } else {
//                System.out.println(users);
//                return userService.insertSelective(users);
//            }

        if (users.getAccount() =="" || users.getPassword() == ""){
            //返回状态码
            return 10;
        }else {
            System.out.println(users);
            return userService.insertSelective(users);
        }
    }

    @RequestMapping("/selectByUser")
    @ResponseBody
    int selectByUser(NavUsers users, HttpSession session){
        NavUsers u1 = userService.selectByUser(users);
        if (u1 == null){
            return 0;
        }else {
            session.setAttribute("users", u1);
            System.out.println(u1);
            return 1;
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        System.out.println("logout");
        session.invalidate();
        return "redirect:../";
    }

}
