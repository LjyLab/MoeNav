/*
 * @Author: XiaoJun 
 * @Date: 2021-06-20 00:09:44 
 * @Last Modified by:   XiaoJun 
 * @Last Modified time: 2021-06-20 00:09:44 
 */

package com.zking.controller;

import com.zking.entity.NavCont;
import com.zking.service.ContService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("cont")
public class ContController {
    @Autowired
    ContService contService;

    @RequestMapping("/selectByExample")
    @ResponseBody
    List<NavCont> selectByExample(HttpServletRequest request){
        return contService.selectByExample(null);
    }

    @RequestMapping("/insertSelective")
    @ResponseBody
    int insertSelective(@RequestBody NavCont navCont, HttpSession session) throws IllegalStateException, IOException {
        String contImage = (String) session.getAttribute("contImage");
        navCont.setMoeImage(contImage);
        System.out.println(navCont);
        return contService.insertSelective(navCont);
    }
//    public String putStaticSource(MultipartFile file) throws UniformInterfaceException
    @RequestMapping("/save")
    String save(MultipartFile file,HttpSession session) throws IOException {
        // 保存图片的路径，图片上传成功后，将路径保存到数据库
        String filePath = "D:\\XiaoJun\\MoeNav\\src\\main\\webapp\\style\\img";
//        Linux路径 777权限
//        String filePath = "//www//server//tomcat_site//moe.cuonc.com//style//img";
        // 获取文件名
        String oriName = file.getOriginalFilename();
        // 获取图片后缀
        String extName = oriName.substring(oriName.lastIndexOf("."));
        // 生成文件新的名字
        String newFileName = UUID.randomUUID() + extName;
        // 封装上传文件位置的全路径
        File targetFile = new File(filePath, newFileName);
        file.transferTo(targetFile);
        //链接图片路径
        String contImage = "style/img/"+newFileName;
        session.setAttribute("contImage", contImage);
        return "redirect:../back.html";
    }
}
