/**
 * CopyRight (c) 2016 北京瑰柏科技有限公司 保留所有权利
 */
package com.yg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yg.service.AdminService;

/**
 * 
 * @author  jack feng
 * @version 1.0.0.2017年6月15日
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;
    
    @RequestMapping(value = "/yg/mg/login/page",method = RequestMethod.GET)
    public ModelAndView loginPage(){
        ModelAndView modelAndView = new ModelAndView("admin/admin");
        return modelAndView;
    }
    
    
    /**
     * 登录
     *
     * @param admin
     * @param password
     * @return
     */
    @RequestMapping(value = "/yg/mg/login",method = RequestMethod.POST)
    public String login(@RequestParam("admin")String admin,@RequestParam("password")String password){
        
        try {
            adminService.queryAdmin(admin, password);
        } catch (Exception e) {
            return e.getMessage();
        }
        
        return null;
        
    }
}
