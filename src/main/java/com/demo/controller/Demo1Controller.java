package com.demo.controller;

import com.demo.bean.Zan;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Demo1Controller {
    @ApiOperation(value = "添加",httpMethod = "POST")
    @RequestMapping("insertObject")
    public String insertObject(Zan example){
        try {
//            example.setId(1);
//            example.setName("张三");
//            example.setTitle("张三入库");
//            example.setZan(2);
            System.out.println("执行完毕...");
            return "redirect:/home";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/add";
        }
    }
}
