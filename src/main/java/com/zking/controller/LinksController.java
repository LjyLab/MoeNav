package com.zking.controller;

import com.zking.entity.NavLinks;
import com.zking.service.LinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("links")
public class LinksController {
    @Autowired
    LinksService linksService;

    @RequestMapping("/selectByExample")
    @ResponseBody
    //查询导航内容
    List<NavLinks> selectByExample(NavLinks navLinks,HttpServletRequest request){
        return linksService.selectByExample(null);
    }

    @RequestMapping("/insertSelective")
    @ResponseBody
    int insertSelective(@RequestBody NavLinks links, HttpSession session)throws IllegalStateException{
        System.out.println(links);
        return linksService.insertSelective(links);
    }
}
