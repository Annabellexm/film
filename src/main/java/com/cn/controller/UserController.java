package com.cn.controller;

import com.cn.model.User;
import com.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;

    //管理员入口
    @GetMapping("/toAdminIndex")
    public ModelAndView toAdminIndex(ModelAndView mav)throws Exception{
        mav.setViewName("admin/index");
        return mav;
    }

    @GetMapping("/findUsers")
    public List<User> findUsers(){
        return this.userService.findUsers();
    }

    @GetMapping("/map")
    public Map<Integer,Object> map(){
        Map<Integer,Object> map=new HashMap<>();
        List<User> usersList=userService.findUsers();
        for(User user:usersList){
            map.put(user.getId(),user);
        }
        return map;
    }


    //添加
    @PostMapping("/add")

    public int addUser(@Validated @RequestBody User user, BindingResult result){
        System.out.println(user.toString());
        if(result.hasErrors()){
            List<ObjectError> allErrors =result.getAllErrors();
            for(ObjectError error:allErrors){
                System.out.println(error.getDefaultMessage());
            }
            return -1;
        }
        return userService.addUser(user);
    }
}
