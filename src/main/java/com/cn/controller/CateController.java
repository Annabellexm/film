package com.cn.controller;

import com.cn.model.Cate;
import com.cn.service.CateService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cate")
public class CateController {

    @Autowired
    private CateService cateService;

    //GetMapping等同于@RequestMapping(method= RequestMethod.GET)
    //PostMapping等同于@RequestMapping(method= RequestMethod.POST)
    //查询所有电影类型
   @GetMapping("/findCates")
   @ResponseBody
    public Map<Integer,Object> findCates(){
/*
       Map map = new HashMap();
       map.put("1","zhangsan");
       map.put("2","lisi");
       map.get("2");
*/
       Map<Integer,Object> map = new HashMap();
        List<Cate> cateList=cateService.findCates();
        for(Cate cate:cateList){
            map.put(cate.getId(),cate.getName());
        }

        Object name= map.get(2);
        System.out.println(name);
     return map;
    }


    @GetMapping("/findCatesById")
    @ResponseBody
    public Object findCatesById(HttpServletRequest request){
       //@RequestParam(defaultValue ="3") int id
/*
       Map map = new HashMap();
       map.put("1","zhangsan");
       map.put("2","lisi");
       map.get("2");
*/
        Map<Integer,Object> map = new HashMap();
        List<Cate> cateList=cateService.findCates();
        for(Cate cate:cateList){
            map.put(cate.getId(),cate.getName());
        }
        int id=Integer.parseInt(request.getParameter("id"));
        Object name= map.get(id);
        System.out.println(name);
        return name;
    }

    @GetMapping("/list")
    @ResponseBody
    public List<Cate> list(){
        List<Cate> cateList=cateService.findCates();
        return cateList;
    }

    //增加
    @PostMapping("/add")
    @ResponseBody
    public int add(HttpServletRequest request){
       String name=request.getParameter("name");
       return cateService.addCate(name);
    }









}
